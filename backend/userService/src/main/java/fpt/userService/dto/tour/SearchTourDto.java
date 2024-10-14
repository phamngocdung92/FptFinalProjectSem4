package fpt.userService.dto.tour;

import fpt.userService.entity.LocationEntity;

public class SearchTourDto {
    private String tourName; //tour name
    private String locationName; //location name

    public SearchTourDto() {
    }

    public SearchTourDto(String name) {
        this.tourName = name;
    }

    public String getTourName() {
        return tourName;
    } //get tour name

    public void setTourName(String name) {
        this.tourName = name;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
