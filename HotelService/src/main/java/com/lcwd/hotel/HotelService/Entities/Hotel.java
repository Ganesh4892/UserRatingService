package com.lcwd.hotel.HotelService.Entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="micro_hotel")
@Getter
@Setter
@Builder
public class Hotel {
@Id	
@Column(name="Hotel_id")	
private String hotel_id;
private String name;
private String location;
private String about;


public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
public Hotel(String hotel_id, String name, String location, String about) {
	super();
	this.hotel_id = hotel_id;
	this.name = name;
	this.location = location;
	this.about = about;
}
public String getHotel_id() {
	return hotel_id;
}
public void setHotel_id(String hotel_id) {
	this.hotel_id = hotel_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}



}
