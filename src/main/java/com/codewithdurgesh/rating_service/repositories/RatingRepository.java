package com.codewithdurgesh.rating_service.repositories;

import com.codewithdurgesh.rating_service.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,Long> {
    List<Rating> findAllByUserId(Long userId);

    List<Rating> findAllByHotelId(Long hotelId);
}
