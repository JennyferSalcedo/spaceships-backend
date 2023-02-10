package com.sofka.spaceships.services;

import com.sofka.spaceships.dto.SpaceshipDto;
import com.sofka.spaceships.dto.SpaceshipFormDto;
import com.sofka.spaceships.persistence.domain.Spaceship;
import com.sofka.spaceships.persistence.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SpaceshipsService {

    @Autowired
    private SpaceshipRepository spaceshipRepository;

    @Autowired
    private SpaceshipFactory spaceshipFactory;

    public SpaceshipDto getSpaceshipById(Long id) throws Error {
        Optional<Spaceship> spaceship = spaceshipRepository.findById(id);
        if(spaceship.isPresent()) {
            return spaceshipFactory.buildSpaceshipDtoFromSpaceship(spaceship.get());
        } else {
            throw new Error("NOT_FOUND");
        }
    }

    public List<SpaceshipDto> getSpaceshipByName(String name) {
        List<Spaceship> spaceships = spaceshipRepository.findByName(name);
        ArrayList<SpaceshipDto> spaceshipDtos = new ArrayList<>();
        for(Spaceship spaceship : spaceships) {
            spaceshipDtos.add(spaceshipFactory.buildSpaceshipDtoFromSpaceship(spaceship));
        }
        return spaceshipDtos;
    }

    public List<SpaceshipDto> getAllSpaceships() {
        ArrayList<SpaceshipDto> createdSpaceshipDtos = new ArrayList<>();
        List<Spaceship> spaceshipList = spaceshipRepository.findAll();
        for(int i = 0; i<spaceshipList.size(); i++) {
            Spaceship spaceship = spaceshipList.get(i);
            SpaceshipDto spaceshipDto = spaceshipFactory.buildSpaceshipDtoFromSpaceship(spaceship);
            createdSpaceshipDtos.add(spaceshipDto);
        }
        return createdSpaceshipDtos;
    }

    public SpaceshipDto createSpaceship(SpaceshipFormDto spaceshipForm) {
        String type = getSpaceshipType(spaceshipForm);
        Spaceship spaceship = mapSpaceshipFormDtoToSpaceShip(spaceshipForm, type);
        Spaceship savedSpaceship = spaceshipRepository.save(spaceship);
        return spaceshipFactory.buildSpaceshipDtoFromSpaceship(savedSpaceship);
    }

    private String getSpaceshipType(SpaceshipFormDto spaceshipFormDto) {
        if(spaceshipFormDto.getNumberOfSeats() != null && spaceshipFormDto.getNumberOfSeats() > 0) {
            return "MannedSpaceCraft";
        } else if(spaceshipFormDto.getHasCells()) {
            return "UnmannedSpaceCraft";
        } else {
            return "ShuttleVehicle";
        }
    }

    private Spaceship mapSpaceshipFormDtoToSpaceShip(SpaceshipFormDto spaceshipForm, String type) {
        Spaceship spaceship = new Spaceship();
        spaceship.setName(spaceshipForm.getName());
        spaceship.setWeight(spaceshipForm.getWeight());
        spaceship.setPushingPower(spaceshipForm.getPushingPower());
        spaceship.setLoadedWeight(spaceshipForm.getLoadedWeight());
        spaceship.setHeight(spaceshipForm.getHeight());
        spaceship.setFuel(spaceshipForm.getFuel());
        spaceship.setSpeed(spaceshipForm.getSpeed());
        spaceship.setHasCells(spaceshipForm.getHasCells());
        spaceship.setGroundClearance(spaceshipForm.getGroundClearance());
        spaceship.setNumberOfSeats(spaceshipForm.getNumberOfSeats());
        spaceship.setType(type);
        return spaceship;
    }
}
