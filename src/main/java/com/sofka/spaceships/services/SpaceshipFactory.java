package com.sofka.spaceships.services;

import com.sofka.spaceships.dto.MannedSpaceCraftDto;
import com.sofka.spaceships.dto.ShuttleVehicleDto;
import com.sofka.spaceships.dto.SpaceshipDto;
import com.sofka.spaceships.dto.UnmannedSpaceCraftDto;
import com.sofka.spaceships.persistence.domain.Spaceship;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SpaceshipFactory {

    public SpaceshipDto buildSpaceshipDtoFromSpaceship(Spaceship spaceship) {
        if(Objects.equals(spaceship.getType(), "MannedSpaceCraft")) {
            return buildMannedSpaceCraftDtoFromSpaceship(spaceship);
        }
        if(Objects.equals(spaceship.getType(), "UnmannedSpaceCraft")) {
            return buildUnmannedSpaceCraftDtoFromSpaceship(spaceship);
        }
        return buildShuttleVehicleDtoFromSpaceship(spaceship);
    }

    private MannedSpaceCraftDto buildMannedSpaceCraftDtoFromSpaceship(Spaceship spaceship) {
        MannedSpaceCraftDto mannedSpaceCraft = new MannedSpaceCraftDto();
        mannedSpaceCraft.setId(spaceship.getId());
        mannedSpaceCraft.setName(spaceship.getName());
        mannedSpaceCraft.setWeight(spaceship.getWeight());
        mannedSpaceCraft.setGroundClearance(spaceship.getGroundClearance());
        mannedSpaceCraft.setNumberOfSeats(spaceship.getNumberOfSeats());
        return mannedSpaceCraft;
    }

    private UnmannedSpaceCraftDto buildUnmannedSpaceCraftDtoFromSpaceship(Spaceship spaceship) {
        UnmannedSpaceCraftDto unmannedSpaceCraft = new UnmannedSpaceCraftDto();
        unmannedSpaceCraft.setId(spaceship.getId());
        unmannedSpaceCraft.setName(spaceship.getName());
        unmannedSpaceCraft.setWeight(spaceship.getWeight());
        unmannedSpaceCraft.setSpeed(spaceship.getSpeed());
        unmannedSpaceCraft.setHasCells(spaceship.getHasCells());
        unmannedSpaceCraft.setPushingPower(spaceship.getPushingPower());
        return unmannedSpaceCraft;
    }

    private ShuttleVehicleDto buildShuttleVehicleDtoFromSpaceship(Spaceship spaceship) {
        ShuttleVehicleDto shuttleVehicle = new ShuttleVehicleDto();
        shuttleVehicle.setId(spaceship.getId());
        shuttleVehicle.setName(spaceship.getName());
        shuttleVehicle.setWeight(spaceship.getWeight());
        shuttleVehicle.setLoadedWeight(spaceship.getLoadedWeight());
        shuttleVehicle.setHeight(spaceship.getHeight());
        shuttleVehicle.setFuel(spaceship.getFuel());
        shuttleVehicle.setPushingPower(spaceship.getPushingPower());
        return shuttleVehicle;
    }

}
