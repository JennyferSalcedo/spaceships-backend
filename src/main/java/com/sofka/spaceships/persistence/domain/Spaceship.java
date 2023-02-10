package com.sofka.spaceships.persistence.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "spaceships" )
public class Spaceship {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String weight;
    @Column
    private Float pushingPower;
    @Column
    private String loadedWeight;
    @Column
    private Integer height;
    @Column
    private String fuel;
    @Column
    private String speed;
    @Column
    private Boolean hasCells;
    @Column
    private String groundClearance;
    @Column
    private Integer numberOfSeats;

    @Column
    private String type;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name= "updated_at", nullable = false)
    private Timestamp updatedAt;

    public Spaceship() {
    }

    public Spaceship(Long id, String name, String weight, Float pushingPower, String loadedWeight, Integer height, String fuel, String speed, Boolean hasCells, String groundClearance, Integer numberOfSeats, String type, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
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
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
