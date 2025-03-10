package com.agregio.services;

import com.agregio.entities.MarketType;
import com.agregio.entities.Offer;
import com.agregio.entities.Park;
import com.agregio.entities.TimeBlock;
import com.agregio.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    public Offer createOffer(MarketType marketType, List<TimeBlock> timeBlocks, List<Park> parks){
        Offer offer = new Offer(marketType, timeBlocks, parks);
        return offerRepository.createOffer(offer);
    }

    public List<Offer> getOffersByMarketType(String marketType){
        return offerRepository.findByMarketType(marketType);
    }
}
