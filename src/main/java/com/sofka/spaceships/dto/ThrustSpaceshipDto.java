package com.sofka.spaceships.dto;

public class ThrustSpaceshipDto extends SpaceshipDto {
    public ThrustSpaceshipDto() {
        super();
    }

    private Float pushingPower;

    public Float getPushingPower() {
        return pushingPower;
    }

    public void setPushingPower(Float pushingPower) {
        this.pushingPower = pushingPower;
    }
}
