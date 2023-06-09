package com.lcwd.user.service.UserService.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="micro_users")
@Getter
@Setter
@Builder

public class User {

	@Id
	@Column(name="ID")
	private String userId;
	@Column(name="NAME",length=20)
	private String name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="ABOUT")
	private String about;
	
	@Transient
	private List<Rating>  ratingsList = new ArrayList();
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String name, String email, String about,List ratingsList) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
		this.ratingsList = ratingsList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public List<Rating> getRatingsList() {
		return ratingsList;
	}
	public void setRatingsList(List<Rating> ratingsList) {
		this.ratingsList = ratingsList;
	}
	
	
	
}
