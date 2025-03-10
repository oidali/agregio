package com.agregio.controllers;

import com.agregio.entities.Park;
import com.agregio.services.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parks")
public class ParkController {

    @Autowired
    ParkService parkService;

    @PostMapping
    public ResponseEntity<Park> createPark(@RequestBody Park parkRequest){
        Park park = parkService.createPark(parkRequest.getType(), parkRequest.getEnergyProvided(), parkRequest.getOffers());
        return ResponseEntity.status(HttpStatus.CREATED).body(park);
    }

    @GetMapping("/market/{marketType}")
    public List<Park> getParksByMarketType(@RequestParam String marketType){
        return parkService.getParksByMarketType(marketType);
    }
}
