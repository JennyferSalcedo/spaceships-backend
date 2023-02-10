package com.sofka.spaceships.dto;

public class UnmannedSpaceCraftDto extends ThrustSpaceshipDto {

    private String speed;
    private Boolean hasCells;

    public UnmannedSpaceCraftDto() {
        super();
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Boolean getHasCells() {
        return hasCells;
    }

    public void setHasCells(Boolean hasCells) {
        this.hasCells = hasCells;
    }

    @Override
    public String getType() {
        return "Nave espacial no tripulada";
    }
}
