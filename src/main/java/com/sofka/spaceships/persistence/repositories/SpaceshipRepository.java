package com.sofka.spaceships.persistence.repositories;

import com.sofka.spaceships.persistence.domain.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpaceshipRepository extends JpaRepository<Spaceship, Long> {

    List<Spaceship> findByName(String name);

}
