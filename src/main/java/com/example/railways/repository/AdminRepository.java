package com.example.railways.repository;

import com.example.railways.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Train, Long> {


    @Query("SELECT a FROM Train a WHERE a.trainNumber=?1")
    Train fetchTrainByTrainNumber(int trainNumber);

    @Query("Select t FROM Train t")
    List<Train> getTrains();

    @Query("SELECT a.availableSeats FROM Train a where a.trainNumber=?1")
    int getSeatsAvailable(int trainNumber);

}
