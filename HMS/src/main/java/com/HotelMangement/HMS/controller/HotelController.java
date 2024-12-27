package com.HotelMangement.HMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HotelMangement.HMS.DTO.HotelDto;
import com.HotelMangement.HMS.DTO.UpdatedHotelDto;
import com.HotelMangement.HMS.model.Hotel;
import com.HotelMangement.HMS.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
   
	@Autowired
	HotelService hotelservice;
	
	@PostMapping("/hotel")
	public Hotel createHotel(@RequestBody HotelDto hotelDto) {
		return hotelservice.saveHotel(hotelDto);
	}
	
	@GetMapping("/get")
	public List<Hotel> getAllHotel(){
		return hotelservice.getAllHotel();
	}
	
	@GetMapping("/getbyid/{id}")
	public Hotel getHotelByid(@PathVariable Long id) {
		return hotelservice.getHotelByid(id);
	}
	
	@PutMapping("/update/{id}")
	public Hotel UpdateHotelById(@RequestBody HotelDto hotelDto, @PathVariable Long id) {
		return hotelservice.updateHotelById(hotelDto,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteHotelById(@PathVariable Long id) {
		 hotelservice.DeleteHotelById(id);
	}
	
	@PutMapping("/updateaddress/{id}")
	public Hotel UpdateHotelByAddress(@RequestBody UpdatedHotelDto updatedhoteldto, @PathVariable Long id) {
		return hotelservice.updateHotelByAddress(updatedhoteldto, id);
	}
}
