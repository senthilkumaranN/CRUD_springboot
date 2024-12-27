package com.HotelMangement.HMS.hotelRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HotelMangement.HMS.model.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {

}
