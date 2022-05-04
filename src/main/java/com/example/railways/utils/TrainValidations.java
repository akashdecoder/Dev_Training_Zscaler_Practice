package com.example.railways.utils;

import org.springframework.stereotype.Service;

import com.example.railways.exceptions.InvalidRequestException;
import com.example.railways.models.Train;

@Service
public class TrainValidations {
	
	public void Validate(Train train) {
		
		
		String stationRegex="^[a-zA-Z]*$";
		String dateRegex="^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
		/*String trainNumberRegex="^\\d{5}$";
		
		if(train.getTrainNumber()<=0 || (String.valueOf(train.getTrainNumber()).matches(trainNumberRegex)==false)) {
			throw new InvalidRequestException("Train number must have 5 digit");
		}*/
		
		ScheduleValidation(train);
		
		if(train.getSource()==null || (train.getSource().matches(stationRegex)==false) || (train.getSource().equals(""))) {
			throw new InvalidRequestException("Please Enter the Source Station with only alphabets");
		}
		
		else if(train.getDestination()==null || (train.getDestination().matches(stationRegex)==false) || (train.getDestination().equals(""))) {
			throw new InvalidRequestException("Please Enter the Destination Station with only alphabets");
		}	
		
		else if(train.getArrival()==null || (train.getArrival().matches(dateRegex)==false) || (train.getArrival().equals(""))) {
			throw new InvalidRequestException("Arrival date cannot be empty and must be of the format [yyyy-mm-dd]");
		}
		
		else if(train.getDeparture()==null || (train.getDeparture().matches(dateRegex)==false) || (train.getDeparture().equals(""))) {
			throw new InvalidRequestException("Departure date cannot be empty and must be of the format [yyyy-mm-dd]");
		}
		
		else if(train.getAvailableSeats()<=0)
		{
			throw new InvalidRequestException("Number of seats made available must be greater than 0");
		}
	}
	
	public void ScheduleValidation(Train train)
	{
		String trainNumberRegex="^\\d{5}$";
		
		if(train.getTrainNumber()<=0 || (String.valueOf(train.getTrainNumber()).matches(trainNumberRegex)==false)) {
			throw new InvalidRequestException("Train number must have 5 digit");
		}
	}

}
