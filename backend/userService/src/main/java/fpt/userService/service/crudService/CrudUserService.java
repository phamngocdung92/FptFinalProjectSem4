package fpt.userService.service.crudService;

import fpt.userService.dto.user.UserDto;
import fpt.userService.entity.UserEntity;

import java.util.List;

public interface CrudUserService {
    List<UserEntity> getAllUsers();
    UserEntity getUserById(int id);
    UserEntity createUser(UserDto user);
    UserEntity updateUser(int id, UserDto user);
    UserEntity deleteUser(int id);
}
