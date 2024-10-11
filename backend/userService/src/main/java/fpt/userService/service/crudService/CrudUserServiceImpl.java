package fpt.userService.service.crudService;

import fpt.userService.dto.user.UserDto;
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
    public UserEntity createUser(UserDto user){
        // Convert DTO to entity
        UserEntity userEntity = user.toUserEntity();

        userEntity.setUserId(null);
        userEntity.setProfileImageId(null);

        // Set timestamps
        LocalDateTime now = LocalDateTime.now();
        userEntity.setCreatedAt(now);
        userEntity.setUpdatedAt(now);

        // (Optional) Hash the password before saving
        // userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

        return crudUserRepository.save(userEntity);
    }
    @Override
    public UserEntity updateUser (int id, UserDto user){
        Optional<UserEntity> userOptional = crudUserRepository.findById(id);
        if (userOptional.isPresent()){
            UserEntity userEntity = userOptional.get();
            if (user.getUsername() != null) {
                userEntity.setUsername(user.getUsername());
            }
            if (user.getPassword() != null) {
                userEntity.setPassword(user.getPassword());
            }
            if (user.getEmail() != null) {
                userEntity.setEmail(user.getEmail());
            }
            if (user.getFullName() != null) {
                userEntity.setFullName(user.getFullName());
            }
            if (user.getPhoneNumber() != null) {
                userEntity.setPhoneNumber(user.getPhoneNumber());
            }
            if (user.getAddress() != null) {
                userEntity.setAddress(user.getAddress());
            }
            if (user.getProfileImageId() != 0) {
                userEntity.setProfileImageId(user.getProfileImageId());
            }
            if (user.getStatusId() != 0) {
                userEntity.setStatusId(user.getStatusId());
            }
            if (user.getDbStatus() != 0) {
                userEntity.setDbStatus(user.getDbStatus());
            }

            // Set timestamp chỉ cho updatedAt vì createdAt giữ nguyên giá trị ban đầu
            userEntity.setUpdatedAt(LocalDateTime.now());

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
