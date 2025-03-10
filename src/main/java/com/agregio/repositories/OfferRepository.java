package com.agregio.repositories;

import com.agregio.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OfferRepository extends JpaRepository<Offer, UUID> {
    Offer createOffer(Offer offer);

    List<Offer> findByMarketType(String marketType);
}
