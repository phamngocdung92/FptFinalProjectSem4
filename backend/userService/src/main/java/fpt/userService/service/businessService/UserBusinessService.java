package fpt.userService.service.businessService;

import fpt.userService.dto.tour.TourDto;
import fpt.userService.entity.TourEntity;

import java.util.List;

public interface UserBusinessService {
    List<TourEntity> findTourByName(String tourName);
    List<TourEntity> findTourByLocation(String locationName);
}
