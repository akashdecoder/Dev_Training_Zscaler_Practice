package com.example.railways.service;

import com.example.railways.models.Train;

import java.util.List;

public interface TrainService {


    Train fetchTrainsByTrainNumber(int trainNumber);

    Train createAdmin(Train trainDetails);

    List<Train> fetchTrains();

    int getAvailableSeats(int trainNumber);

}
