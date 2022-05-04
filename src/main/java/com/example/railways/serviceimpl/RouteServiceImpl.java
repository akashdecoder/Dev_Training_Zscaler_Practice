package com.example.railways.serviceimpl;

import com.example.railways.models.RouteDetails;
import com.example.railways.repository.RouteRepository;
import com.example.railways.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    RouteRepository routeRepository;

    @Override
    public RouteDetails createRoute(RouteDetails routeDetails) {

        return routeRepository.save(routeDetails);
    }

    @Override
    public List<RouteDetails> getAllRoutes() {
        return routeRepository.getAllRoutes();
    }

    @Override
    public List<RouteDetails> getAllRoutesBetween(RouteDetails routeDetails) {
        return routeRepository.getAllRoutesBetween(routeDetails.getFromId().getpId(), routeDetails.getToId().getpId());
    }
}
