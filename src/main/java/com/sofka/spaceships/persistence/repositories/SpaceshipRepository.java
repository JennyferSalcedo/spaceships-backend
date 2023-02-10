package com.sofka.spaceships.persistence.repositories;

import com.sofka.spaceships.persistence.domain.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpaceshipRepository extends JpaRepository<Spaceship, Long> {
    List<Spaceship> findByName(String name);

}
