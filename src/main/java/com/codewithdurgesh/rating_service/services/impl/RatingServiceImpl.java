package com.codewithdurgesh.rating_service.services.impl;

import com.codewithdurgesh.rating_service.entities.Rating;
import com.codewithdurgesh.rating_service.repositories.RatingRepository;
import com.codewithdurgesh.rating_service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepository ratingRepository;
    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(Long userId) {
        return ratingRepository.findAllByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(Long hotelId) {
        return ratingRepository.findAllByHotelId(hotelId);
    }
}
