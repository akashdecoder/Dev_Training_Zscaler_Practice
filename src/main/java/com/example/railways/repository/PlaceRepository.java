package com.example.railways.repository;

import com.example.railways.models.PlaceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<PlaceDetails, Long> {
    @Query(value = "SELECT * FROM place a WHERE a.p_name=?1", nativeQuery = true)
    PlaceDetails fetchByPlaceName(String place);

    @Query(value = "SELECT * FROM place a WHERE a.p_id=?1", nativeQuery = true)
    PlaceDetails fetchByPlaceId(int placeId);

    @Query(value = "SELECT * FROM place a;", nativeQuery = true)
    List<PlaceDetails> getAllPlaces();
}
