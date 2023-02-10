package com.sofka.spaceships.dto;

public class MannedSpaceCraftDto extends SpaceshipDto {

    private String groundClearance;
    private Integer numberOfSeats;

    public MannedSpaceCraftDto() {
    }

    public String getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(String groundClearance) {
        this.groundClearance = groundClearance;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String getType() {
        return "Nave espacial tripulada";
    }
}
