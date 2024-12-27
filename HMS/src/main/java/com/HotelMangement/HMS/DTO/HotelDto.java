package com.HotelMangement.HMS.DTO;



public class HotelDto {
	
	private String name;
	private String address;
	private String city;
	private float rating;
    private int postalCode;
	private boolean isAvailable;

	public HotelDto(String name, String address, String city, float rating, int postalCode, boolean isAvailable) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.rating = rating;
		this.postalCode = postalCode;
		this.isAvailable = isAvailable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public HotelDto() {
		
	}

	
}
