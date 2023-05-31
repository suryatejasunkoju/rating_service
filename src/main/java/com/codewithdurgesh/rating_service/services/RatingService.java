package com.codewithdurgesh.rating_service.services;

import com.codewithdurgesh.rating_service.entities.Rating;

import java.util.List;

public interface RatingService {
    public Rating createRating(Rating rating);
    public List<Rating> getRatings();
    public List<Rating> getRatingsByUserId(Long userId);
    public List<Rating> getRatingsByHotelId(Long hotelId);
}
