package fpt.userService.service.crudService;

import fpt.userService.dto.responseDTO.resUserDto;
import fpt.userService.entity.UserEntity;

import java.util.List;

public interface CrudUserService {
    List<UserEntity> getAllUsers();
    UserEntity getUserById(int id);
    UserEntity createUser(resUserDto user);
    UserEntity updateUser(int id, resUserDto user);
    UserEntity deleteUser(int id);
}
