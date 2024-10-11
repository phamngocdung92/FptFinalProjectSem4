package fpt.userService.dto.tour;

public class SearchTourByNameDto {
    private String name;

    public SearchTourByNameDto() {
    }

    public SearchTourByNameDto(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
}
