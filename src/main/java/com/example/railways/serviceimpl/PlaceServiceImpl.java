package com.example.railways.serviceimpl;

import com.example.railways.models.PlaceDetails;
import com.example.railways.repository.PlaceRepository;
import com.example.railways.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    PlaceRepository placeRepository;

    @Override
    public PlaceDetails createPlace(PlaceDetails placeDetails) {
        return placeRepository.save(placeDetails);
    }

    @Override
    public PlaceDetails fetchByPlaceName(String place) {
        PlaceDetails placeDetails = placeRepository.fetchByPlaceName(place);
        return placeDetails;
    }

    @Override
    public PlaceDetails fetchByPlaceId(int placeId) {
        PlaceDetails placeDetails = placeRepository.fetchByPlaceId(placeId);
        return placeDetails;
    }

    @Override
    public List<PlaceDetails> getAllPlaces() {
        return placeRepository.getAllPlaces();
    }
}
