package com.HotelMangement.HMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelMangement.HMS.DTO.HotelDto;
import com.HotelMangement.HMS.DTO.UpdatedHotelDto;
import com.HotelMangement.HMS.hotelRepo.HotelRepo;
import com.HotelMangement.HMS.model.Hotel;



@Service
public class HotelService {

    @Autowired
    private HotelRepo hotelRepository;

    public Hotel saveHotel(HotelDto hotelDto) {
       
        Hotel hotel = new Hotel();
        hotel.setName(hotelDto.getName());
        hotel.setAddress(hotelDto.getAddress());
        hotel.setCity(hotelDto.getCity());
        hotel.setPostalCode(hotelDto.getPostalCode());
        hotel.setRating(hotelDto.getRating());
        hotel.setAvailable(hotelDto.isAvailable());

        
     hotelRepository.save(hotel);
     return hotel;

    }

	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

	public Hotel getHotelByid(Long id) {
		Optional<Hotel> hotelBox = hotelRepository.findById(id);
		if(hotelBox.isPresent()) {
			return hotelBox.get();
		}
		else return null;
	}

	public Hotel updateHotelById(HotelDto hotelDto, Long id) {
		Hotel hotel = getHotelByid(id);
		if(hotel != null) {
			 hotel.setName(hotelDto.getName());
		        hotel.setAddress(hotelDto.getAddress());
		        hotel.setCity(hotelDto.getCity());
		        hotel.setPostalCode(hotelDto.getPostalCode());
		        hotel.setRating(hotelDto.getRating());
		        hotel.setAvailable(hotelDto.isAvailable());

		        
		     hotelRepository.save(hotel);
		     return hotel;
		}
		
		else return null;
	}

	public void DeleteHotelById(Long id) {
		Hotel hotel = getHotelByid(id);
		if(hotel != null) {
		   hotelRepository.deleteById(id);
	}
}

	public Hotel updateHotelByAddress(UpdatedHotelDto updatedhoteldto, Long id) {
	       Hotel hotel = getHotelByid(id);
	       if(hotel != null) {
	           hotel.setAddress(updatedhoteldto.getAddress());
	           hotel.setCity(updatedhoteldto.getCity());
	           hotel.setPostalCode(updatedhoteldto.getPostalCode());
	           
	        hotelRepository.save(hotel);
	        return hotel;
	       }
	       else return null;
	}
	
}

