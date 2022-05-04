package com.example.railways.service;

import com.example.railways.models.RouteDetails;

import java.util.List;

public interface RouteService {
    RouteDetails createRoute(RouteDetails routeDetails);

    List<RouteDetails> getAllRoutes();

    List<RouteDetails> getAllRoutesBetween(RouteDetails routeDetails);
}
