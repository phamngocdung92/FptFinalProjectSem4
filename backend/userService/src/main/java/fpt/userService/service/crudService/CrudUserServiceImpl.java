package fpt.userService.service.crudService;

import fpt.userService.dto.responseDTO.resUserDto;
import fpt.userService.entity.UserEntity;
import fpt.userService.repository.crudRepository.CrudUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CrudUserServiceImpl implements CrudUserService {
    private final CrudUserRepository crudUserRepository;
    @Autowired
    public CrudUserServiceImpl(CrudUserRepository crudUserRepository) {
        this.crudUserRepository = crudUserRepository;
    }
    @Override
    public List<UserEntity> getAllUsers() {
        return crudUserRepository.findAll();
    }
    @Override
    public UserEntity getUserById(int id) {
        return crudUserRepository.findById(id).orElse(null);
    }
    @Override
    public UserEntity createUser(resUserDto user){
        // Convert DTO to entity
        UserEntity userEntity = user.toUserEntity();

        userEntity.setUserId(null);

        // Set timestamps
        LocalDateTime now = LocalDateTime.now();
        userEntity.setCreatedAt(now);
        userEntity.setUpdatedAt(now);

        // (Optional) Hash the password before saving
        // userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

        return crudUserRepository.save(userEntity);
    }
    @Override
    public UserEntity updateUser (int id, resUserDto user){
        Optional<UserEntity> userOptional = crudUserRepository.findById(id);
        if (userOptional.isPresent()){
            UserEntity userEntity = userOptional.get();
            userEntity.setUsername(user.getUsername());
            userEntity.setPassword(user.getPassword());
            userEntity.setEmail(user.getEmail());
            userEntity.setFullName(user.getFullName());
            userEntity.setPhoneNumber(user.getPhoneNumber());
            userEntity.setAddress(user.getAddress());
            userEntity.setProfileImageId(user.getProfileImageId());
            userEntity.setStatusId(user.getStatusId());
            userEntity.setDbStatus(user.getDbStatus());
            userEntity.setCreatedAt(user.getCreatedAt());
            userEntity.setUpdatedAt(user.getUpdatedAt());
            return crudUserRepository.save(userEntity);
        }
        return null;
    }
    @Override
    public UserEntity deleteUser(int id){
        Optional<UserEntity> userOptional = crudUserRepository.findById(id);
        if (userOptional.isPresent()){
            UserEntity userEntity = userOptional.get();
            userEntity.setDbStatus(0);
            return crudUserRepository.save(userEntity);
        }
        return null;
    }
}
