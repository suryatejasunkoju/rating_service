package com.codewithdurgesh.rating_service.controllers;

import com.codewithdurgesh.rating_service.entities.Rating;
import com.codewithdurgesh.rating_service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    RatingService ratingService;
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Rating createRating(@RequestBody Rating rating){
        return ratingService.createRating(rating);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Rating> getAllRatings(){
        return ratingService.getRatings();
    }

    @GetMapping("/users/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Rating> getRatingsByUserId(@PathVariable("userId") Long userId){
        return ratingService.getRatingsByUserId(userId);
    }
    @GetMapping("/hotels/{hotelId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Rating> getRatingsByHotelId(@PathVariable("hotelId") Long hotelId){
        return ratingService.getRatingsByHotelId(hotelId);
    }
}
