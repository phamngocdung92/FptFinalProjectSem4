package fpt.userService.service.businessService;

import fpt.userService.dto.tour.SearchTourDto;
import fpt.userService.entity.TourEntity;
import fpt.userService.repository.businessRepository.UserBusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBusinessServiceImpl implements UserBusinessService {
    private final UserBusinessRepository userBusinessRepository;
    @Autowired
    public UserBusinessServiceImpl(UserBusinessRepository userBusinessRepository) {
        this.userBusinessRepository = userBusinessRepository;
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
}
