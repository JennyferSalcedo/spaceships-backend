package com.sofka.spaceships.controllers;

import com.sofka.spaceships.dto.SpaceshipDto;
import com.sofka.spaceships.dto.SpaceshipFormDto;
import com.sofka.spaceships.services.SpaceshipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/spaceships")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://spaceships-frontend.herokuapp.com"
})
public class SpaceshipsController {

    @Autowired
    private SpaceshipsService spaceshipsService;

    @GetMapping("{id}")
    public ResponseEntity<SpaceshipDto> getSpaceshipById(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(spaceshipsService.getSpaceshipById(id));
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("filter")
    public ResponseEntity<List<SpaceshipDto>> getSpaceshipsByName(@RequestParam String name) {
        try {
            return ResponseEntity.ok(spaceshipsService.getSpaceshipByName(name));
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<SpaceshipDto>> getSpaceships() {
        try {
            return ResponseEntity.ok(spaceshipsService.getAllSpaceships());
        } catch (Error error) {
            if(error.getMessage().equals("NOT_FOUND")) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping
    public ResponseEntity<SpaceshipDto> createSpaceship(@RequestBody SpaceshipFormDto spaceshipForm) {
        try {
            return ResponseEntity.ok(spaceshipsService.createSpaceship(spaceshipForm));
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
