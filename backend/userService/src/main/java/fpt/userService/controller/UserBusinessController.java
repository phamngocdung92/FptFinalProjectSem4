package fpt.userService.controller;

import fpt.userService.dto.tour.SearchTourDto;
import fpt.userService.entity.TourEntity;
import fpt.userService.service.businessService.UserBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@RestController
@RequestMapping("/api/userbusiness")
public class UserBusinessController {
    private final UserBusinessService userBusinessService;
    @Autowired
    public UserBusinessController(UserBusinessService userBusinessService) {
        this.userBusinessService = userBusinessService;
    }
    //find tour by input
    @PostMapping("/find-tour-by-name")
    public ResponseEntity<List<TourEntity>> findTourByName(@RequestBody SearchTourDto TourName) {
        List<TourEntity> resTourDtos = userBusinessService.findTourByName(TourName.getTourName());
        return ResponseEntity.ok(resTourDtos);
    }
    @PostMapping("/find-tour-by-location")
    public ResponseEntity<List<TourEntity>> findTourByLocation(@RequestBody SearchTourDto LocationName) {
        List<TourEntity> resTourDtos = userBusinessService.findTourByLocation(LocationName.getLocationName());
        return ResponseEntity.ok(resTourDtos);
    }
    @PostMapping("/find-tour-by-search") //search: location + person + start date + end date
    public ResponseEntity<List<TourEntity>> findTourBySearch(@RequestBody SearchTourDto searchTourDto) {
        LocalDate startDate = searchTourDto.getStartDate();
        LocalDate endDate = searchTourDto.getEndDate();
        String durationString = "";
        int person = searchTourDto.getPerson();

        if (startDate != null && endDate != null && startDate.isBefore(endDate)) {
            // Calculate the duration in days
            long tempDuration = ChronoUnit.DAYS.between(startDate, endDate);
            // Convert the duration to a String
            durationString = String.valueOf(tempDuration);
        } else if (startDate != null && endDate != null && startDate.isEqual(endDate)) {
            // If the dates are equal, the duration is 0
            durationString = "0";
        } else {
            // If the dates are invalid, the duration is -1
            durationString = "-1";
        }

        SearchTourDto inputParam = new SearchTourDto();
        inputParam.setLocationName(searchTourDto.getLocationName());
        inputParam.setDuration(durationString);
        inputParam.setPerson(searchTourDto.getPerson());

        List<TourEntity> resTourDtos = userBusinessService.findTourBySearch(inputParam);
        return ResponseEntity.ok(resTourDtos);
    }
    @GetMapping("/find-tour-by-id/{id}")
    public ResponseEntity<TourEntity> findTourById(@PathVariable int id) {
        return ResponseEntity.ok(userBusinessService.findTourById(id));
    }

}
