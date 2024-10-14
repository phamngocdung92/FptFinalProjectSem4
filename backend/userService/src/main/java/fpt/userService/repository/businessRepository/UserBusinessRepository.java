package fpt.userService.repository.businessRepository;

import fpt.userService.dto.tour.TourDto;
import fpt.userService.entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserBusinessRepository extends JpaRepository<TourEntity, Integer> {
    @Query(value = "SELECT * FROM tours t WHERE LOWER(t.Name) LIKE LOWER(CONCAT('%', :name, '%'))", nativeQuery = true)
    List<TourEntity> findTourByName(@Param("name") String name);
    @Query(value = "SELECT t.* FROM tours t JOIN locations l ON t.locationID = l.locationID WHERE LOWER(l.Name) LIKE LOWER(CONCAT('%', :locationName, '%'))", nativeQuery = true)
    List<TourEntity> findTourByLocation(@Param("locationName") String locationName);
}
