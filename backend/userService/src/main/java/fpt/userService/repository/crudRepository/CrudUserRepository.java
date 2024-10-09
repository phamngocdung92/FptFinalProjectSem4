package fpt.userService.repository.crudRepository;

import fpt.userService.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudUserRepository extends JpaRepository<UserEntity, Integer> {
}
