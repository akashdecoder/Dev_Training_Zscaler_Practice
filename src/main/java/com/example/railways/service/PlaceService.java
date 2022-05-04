package com.example.railways.service;

import com.example.railways.models.PlaceDetails;

import java.util.List;

public interface PlaceService {
    PlaceDetails createPlace(PlaceDetails placeDetails);

    PlaceDetails fetchByPlaceName(String place);

    PlaceDetails fetchByPlaceId(int placeId);

    List<PlaceDetails> getAllPlaces();
}
