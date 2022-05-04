package com.example.railways.controler;

import com.example.railways.models.*;
import com.example.railways.repository.UserRepository;
import com.example.railways.response.*;
import com.example.railways.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class GetController {
    @Autowired
    PlaceService placeService;

    @Autowired
    RouteService routeService;

    @Autowired
    TrainService trainService;

    @Autowired
    TicketService ticketService;

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getPlaces")
    public ResponseEntity<Object> getPlaces() {
        List<PlaceDetails> fetchPlaces = placeService.getAllPlaces();
        GetPlaceResponse response = new GetPlaceResponse(new Date(), "Get Places successfully", "200", fetchPlaces);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @GetMapping("/getRoutes")
    public ResponseEntity<Object> getRoutes() {
        List<RouteDetails> fetchRoutes = routeService.getAllRoutes();
        GetRouteResponse response = new GetRouteResponse(new Date(), "Get Routes successfully", "200", fetchRoutes);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @GetMapping("/getRoutesBn")
    public ResponseEntity<Object> getRoutes(@RequestBody RouteDetails routeDetails) {
        if (routeDetails.getFromId() == null || routeDetails.getToId() == null) {
            ErrorResponse response = new ErrorResponse(new Date(), "Fill all the details", "409");
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        }

        List<RouteDetails> fetchRoutes = routeService.getAllRoutesBetween(routeDetails);
        GetRouteResponse response = new GetRouteResponse(new Date(), "Get Routes successfully", "200", fetchRoutes);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
    @GetMapping("/getSeatsAvailable")
    public ResponseEntity<Object> getSeatsAvailable(@RequestBody Train trainDetails) {
        int trainNumber = trainDetails.getTrainNumber();
        if(trainNumber == 0){
            ErrorResponse response = new ErrorResponse(new Date(), "Enter train number as trainNumber", "409");
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        }

        Train train = trainService.fetchTrainsByTrainNumber(trainNumber);
        if(train == null){
            ErrorResponse response = new ErrorResponse(new Date(), "Train doesn't exist", "409");
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        }
        int available = trainService.getAvailableSeats(trainNumber);
        SeatsAvailableResponse response = new SeatsAvailableResponse(new Date(),"Get Seats Available Successful","200",available);
        return new ResponseEntity<Object>(response,HttpStatus.OK);
    }
    @GetMapping("/myTickets")
    public ResponseEntity<Object> getMyTickets(@RequestBody UserDetails userDetails) {
        int uId = userDetails.getuId();
        if(uId == 0){
            ErrorResponse response = new ErrorResponse(new Date(), "Enter UserID as uId", "409");
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        }
        UserDetails user = userService.fetchById(uId);
        if(user == null){
            ErrorResponse response = new ErrorResponse(new Date(), "User doesn't exist", "409");
            return new ResponseEntity<Object>(response, HttpStatus.OK);
        }
        List<TicketDetails> myTickets = ticketService.fetchTicket(uId);
        getMyTicketsResponse response = new getMyTicketsResponse(new Date(),"Get My Tickets Successful","200",myTickets);
        return new ResponseEntity<Object>(response,HttpStatus.OK);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<Object> getAllUsers() {
        List<UserDetails> users = userRepository.findAll();
        AllUserReponse allUserReponse = new AllUserReponse("Users retrieved", HttpStatus.OK.value(), users);
        return new ResponseEntity<Object>(allUserReponse, HttpStatus.OK);
    }

}
