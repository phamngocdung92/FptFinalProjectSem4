package fpt.userService.controller;

import fpt.userService.dto.tour.SearchTourDto;
import fpt.userService.entity.TourEntity;
import fpt.userService.service.businessService.UserBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
