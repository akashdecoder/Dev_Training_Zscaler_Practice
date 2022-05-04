package com.example.railways.serviceimpl;

import com.example.railways.models.Train;
import com.example.railways.repository.AdminRepository;
import com.example.railways.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public Train fetchTrainsByTrainNumber(int trainNumber) {
        // TODO Auto-generated method stub

        return adminRepository.fetchTrainByTrainNumber(trainNumber);
    }

    @Override
    public Train createAdmin(Train trainDetails) {
        // TODO Auto-generated method stub
        return adminRepository.save(trainDetails);
    }

    @Override
    public List<Train> fetchTrains() {
        // TODO Auto-generated method stub
        return adminRepository.getTrains();
    }

    @Override
    public int getAvailableSeats(int trainNumber) {

        return adminRepository.getSeatsAvailable(trainNumber);
    }

}
