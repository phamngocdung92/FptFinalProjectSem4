package fpt.userService.controller;

import fpt.userService.dto.responseDTO.resUserDto;
import fpt.userService.entity.UserEntity;
import fpt.userService.service.crudService.CrudUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class CrudUserController {
    private final CrudUserService crudUserService;

    @Autowired
    public CrudUserController(CrudUserService crudUserService) {
        this.crudUserService = crudUserService;
    }
    //get all users
    @GetMapping("/getAll")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> resUserDtos = crudUserService.getAllUsers();
        return ResponseEntity.ok(resUserDtos);
    }
    //get user by id
    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable int id) {
            UserEntity user = crudUserService.getUserById(id);
            if (user != null) {
                return ResponseEntity.ok(user);
            } else {
                return ResponseEntity.notFound().build();
            }
    }
    //create user
    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody resUserDto user) {
        UserEntity createdUser = crudUserService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    //update user
    @PutMapping("/{id}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable int id, @RequestBody resUserDto user) {
        UserEntity updatedUser = crudUserService.updateUser(id, user);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //delete user but only change dbstatus of user to 0
    @PutMapping("/delete/{id}")
    public ResponseEntity<UserEntity> deleteUser(@PathVariable int id) {
        UserEntity updatedUser = crudUserService.deleteUser(id);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
