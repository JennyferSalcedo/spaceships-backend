package com.sofka.spaceships.dto;

public class SpaceshipFormDto {

    private String name;
    private String weight;
    private Float pushingPower;
    private String loadedWeight;
    private Integer height;
    private String fuel;
    private String speed;
    private Boolean hasCells;
    private String groundClearance;
    private Integer numberOfSeats;

    public SpaceshipFormDto() {
    }

    public SpaceshipFormDto(String name, String weight, Float pushingPower, String loadedWeight, Integer height, String fuel, String speed, Boolean hasCells, String groundClearance, Integer numberOfSeats) {
        this.name = name;
        this.weight = weight;
        this.pushingPower = pushingPower;
        this.loadedWeight = loadedWeight;
        this.height = height;
        this.fuel = fuel;
        this.speed = speed;
        this.hasCells = hasCells;
        this.groundClearance = groundClearance;
        this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Float getPushingPower() {
        return pushingPower;
    }

    public void setPushingPower(Float pushingPower) {
        this.pushingPower = pushingPower;
    }

    public String getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(String loadedWeight) {
        this.loadedWeight = loadedWeight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
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
}
