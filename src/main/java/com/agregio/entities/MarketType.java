package com.agregio.entities;

public enum MarketType {
    RESERVE_PRIMARE("Réserve Primaire"),
    RESERVE_SECONDAIRE("Réserve Secondaire"),
    RESERVE_RAPIDE("Réserve Rapide");

    public final String name;

    private MarketType(String name){
        this.name = name;
    }
}
