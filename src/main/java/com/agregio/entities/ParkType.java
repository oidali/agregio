package com.agregio.entities;

public enum ParkType {
    SOLAIRE("Solaire"),
    EOLIEN("Eolien"),
    HYDROLIQUE("Hydrolique");

    public final String name;

    private ParkType(String name){
        this.name = name;
    }
}
