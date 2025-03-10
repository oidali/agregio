package com.agregio.services;

import com.agregio.entities.MarketType;
import com.agregio.entities.Offer;
import com.agregio.entities.Park;
import com.agregio.entities.ParkType;
import com.agregio.repositories.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.basic.BasicBorders;
import java.util.List;

@Service
public class ParkService {

    @Autowired
    ParkRepository parkRepository;

    public Park createPark(ParkType parkType, double energyProvided, List<Offer> offers){
        Park park = new Park(parkType, energyProvided, offers);
        return parkRepository.createPark(park);
    }

    public List<Park> getParksByMarketType(String marketType){
        return parkRepository.findByMarketType(marketType);
    }
}
