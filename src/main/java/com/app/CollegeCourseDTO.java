package com.app;

public class CollegeCourseDTO {
    private String collegeName;
    private String courseName;
    private Double courseFee;
    private String courseDuration;
    private String accommodation;
    private Double accommodationFee;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
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
	public CollegeCourseDTO(String collegeName, String courseName, Double courseFee, String courseDuration,
			String accommodation, Double accommodationFee) {
		super();
		this.collegeName = collegeName;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.courseDuration = courseDuration;
		this.accommodation = accommodation;
		this.accommodationFee = accommodationFee;
	}
	public CollegeCourseDTO() {
		super();
	}

    // Constructor, Getters, and Setters
	
	@Override
    public String toString() {
        return "CollegeCourseDTO{" +
                "collegeName='" + collegeName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseFee=" + courseFee +
                ", courseDuration=" + courseDuration +
                ", accommodation='" + accommodation + '\'' +
                ", accommodationFee=" + accommodationFee +
                '}';
    }
    
}
