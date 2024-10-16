package fpt.userService.service.businessService;

import fpt.userService.common.commonServiceImpl;
import fpt.userService.dto.tour.SearchTourDto;
import fpt.userService.entity.TourEntity;
import fpt.userService.entity.UserEntity;
import fpt.userService.repository.businessRepository.UserBusinessRepository;
import fpt.userService.service.crudService.CrudUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBusinessServiceImpl implements UserBusinessService {
    private final UserBusinessRepository userBusinessRepository;
    private final CrudUserServiceImpl crudUserService;
    private final commonServiceImpl commonServiceImpl;
    @Autowired
    public UserBusinessServiceImpl(UserBusinessRepository userBusinessRepository, CrudUserServiceImpl crudUserService, commonServiceImpl commonServiceImpl) {
        this.userBusinessRepository = userBusinessRepository;
        this.crudUserService = crudUserService;
        this.commonServiceImpl = commonServiceImpl;
    }
    @Override
    public List<TourEntity> findTourByName(String tourName) {
        return userBusinessRepository.findTourByName(tourName);
    }
    @Override
    public List<TourEntity> findTourByLocation(String locationName) {
        return userBusinessRepository.findTourByLocation(locationName);
    }
    @Override
    public List<TourEntity> findTourBySearch(SearchTourDto searchTourDto) {
        return userBusinessRepository.findTourBySearch(searchTourDto.getLocationName(), searchTourDto.getDuration(), searchTourDto.getPerson());
    }
    @Override
    public TourEntity findTourById(int id) {
        return userBusinessRepository.findTourById(id);
    }
   @Override
    public List<TourEntity> findTourByHighestRating() {
        return userBusinessRepository.findTourByHighestRating();
    }
}
