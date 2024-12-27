package com.HotelMangement.HMS.DTO;



public class UpdatedHotelDto {
	
	private String address;
	private String city;
    private int postalCode;
	
	

	public UpdatedHotelDto(String address, String city, float rating, int postalCode, boolean isAvailable) {
		super();
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
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

	

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	
}
