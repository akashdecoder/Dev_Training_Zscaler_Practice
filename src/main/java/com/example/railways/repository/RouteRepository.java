package com.example.railways.repository;

import com.example.railways.models.RouteDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<RouteDetails, Long> {
    @Query(value = "SELECT * FROM route a WHERE a.from_id=?1 AND a.to_id=?2", nativeQuery = true)
    List<RouteDetails> getAllRoutesBetween(int fromId, int toId);

    @Query(value = "SELECT * FROM route a;", nativeQuery = true)
    List<RouteDetails> getAllRoutes();
}
