package com.agregio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class TimeBlock {
    @Column(name  = "start_time_time_block")
    private LocalDateTime startTime;

    @Column(name  = "end_time_time_block")
    private LocalDateTime endTime;

    @Column(name  = "energy_quantity_time_block")
    private double energyQuantity;

    @Column(name  = "min_price_time_block")
    private double minPrice;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public TimeBlock(LocalDateTime startTime, LocalDateTime endTime, double energyQuantity, double minPrice) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.energyQuantity = energyQuantity;
        this.minPrice = minPrice;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double getEnergyQuantity() {
        return energyQuantity;
    }

    public void setEnergyQuantity(double energyQuantity) {
        this.energyQuantity = energyQuantity;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }
}
