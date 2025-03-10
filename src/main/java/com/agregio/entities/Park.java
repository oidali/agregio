package com.agregio.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;
import java.util.UUID;

@EntityScan
public class Park {

    @Id
    @GeneratedValue
    @Column(name = "park_id")
    private UUID id;

    @Column(name = "park_type")
    private ParkType type;

    @Column(name = "park_energy_provided")
    private double energyProvided;

    @ManyToMany(mappedBy = "parks")
    private List<Offer> offers;

    public Park(ParkType type, double energyProvided, List<Offer> offers) {
        this.type = type;
        this.energyProvided = energyProvided;
        this.offers = offers;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ParkType getType() {
        return type;
    }

    public void setType(ParkType type) {
        this.type = type;
    }

    public double getEnergyProvided() {
        return energyProvided;
    }

    public void setEnergyProvided(double energyProvided) {
        this.energyProvided = energyProvided;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }
}
