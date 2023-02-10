package com.sofka.spaceships.dto;

public class ShuttleVehicleDto extends ThrustSpaceshipDto {

    private String loadedWeight;
    private Integer height;
    private String fuel;

    public ShuttleVehicleDto() {
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

    @Override
    public String getType() {
        return "Vehículo lanzadera";
    }
}
