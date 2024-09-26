package com.app.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

//College.java
@Entity
@Getter
@Setter
public class College {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;
 private String accommodation;
 private Double accommodationFee;

 @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
 private List<Course> courses;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAccommodation() {
	return accommodation;
}

public void setAccommodation(String accommodation) {
	this.accommodation = accommodation;
}

public Double getAccommodationFee() {
	return accommodationFee;
}

public void setAccommodationFee(Double accommodationFee) {
	this.accommodationFee = accommodationFee;
}

public List<Course> getCourses() {
	return courses;
}

public void setCourses(List<Course> courses) {
	this.courses = courses;
}

 // Getters and Setters
 
}
