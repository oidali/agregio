package com.agregio.repositories;

import com.agregio.entities.Park;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ParkRepository extends JpaRepository<Park, UUID> {
    Park createPark(Park park);

    List<Park> findByMarketType(String marketType);
}
