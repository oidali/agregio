package com.agregio.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Offer {
    @Id
    @GeneratedValue
    @Column(name = "offer_id")
    private UUID id;

    @Column(name = "offer_market")
    private MarketType marketType;

    @OneToMany
    @Column(name = "offer_time_blocks")
    private List<TimeBlock> timeBlocks;

    @ManyToMany
    @JoinTable(
            name = "offer_park",
            joinColumns = @JoinColumn(name = "offer_id"),
            inverseJoinColumns = @JoinColumn(name = "park_id")
    )
    private List<Park> parks;

    public Offer() {
    }

    public Offer(MarketType marketType, List<TimeBlock> timeBlocks, List<Park> parks) {
        this.marketType = marketType;
        this.timeBlocks = timeBlocks;
        this.parks = parks;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<TimeBlock> getTimeBlocks() {
        return timeBlocks;
    }

    public void setTimeBlocks(List<TimeBlock> timeBlocks) {
        this.timeBlocks = timeBlocks;
    }

    public MarketType getMarketType() {
        return marketType;
    }

    public void setMarketType(MarketType marketType) {
        this.marketType = marketType;
    }

    public List<Park> getParks() {
        return parks;
    }

    public void setParks(List<Park> parks) {
        this.parks = parks;
    }
}
