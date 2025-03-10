package com.agregio.controllers;

import com.agregio.entities.Offer;
import com.agregio.services.OfferService;
import com.agregio.services.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferService offerService;

    @PostMapping
    public ResponseEntity<Offer> createOffer(@RequestBody Offer offerRequest){
        Offer offer = new Offer(offerRequest.getMarketType(), offerRequest.getTimeBlocks(), offerRequest.getParks());
        return ResponseEntity.status(HttpStatus.CREATED).body(offer);
    }

    @GetMapping("/marketType")
    public List<Offer> getOffersByMarketType(@RequestParam  String marketType){
        return offerService.getOffersByMarketType(marketType);
    }
}
