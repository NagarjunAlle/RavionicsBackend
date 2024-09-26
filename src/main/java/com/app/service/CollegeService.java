package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CollegeCourseDTO;
import com.app.model.College;
import com.app.model.Course;
import com.app.repository.CollegeRepository;
import com.app.repository.CourseRepository;


@Service
public class CollegeService {

 @Autowired
 private CollegeRepository collegeRepository;

 @Autowired
 private CourseRepository courseRepository;

 public List<CollegeCourseDTO> getCollegeDetailsWithCourses() {
     List<College> colleges = collegeRepository.findAll();
     List<CollegeCourseDTO> collegeCourseDTOs = new ArrayList<>();

     for (College college : colleges) {
         List<Course> courses = courseRepository.findByCollegeId(college.getId());

         for (Course course : courses) {
             CollegeCourseDTO dto = new CollegeCourseDTO();
             dto.setCollegeName(college.getName());
             dto.setCourseName(course.getName());
             dto.setCourseFee(course.getFee());
             dto.setCourseDuration(course.getDuration());
             dto.setAccommodation(college.getAccommodation());
             dto.setAccommodationFee(college.getAccommodationFee());

             collegeCourseDTOs.add(dto);
             
            // List<CollegeCourseDTO> collegges = collegeRepository.findCollegesByCourseName("Computer Science");
        	 //System.out.println(collegges);
         }
     }

     return collegeCourseDTOs;
 }
 
 
 
 public List<CollegeCourseDTO> getCollegesByCourseName(String courseName) {
	 //List<CollegeCourseDTO> colleges = collegeRepository.findCollegesByCourseName("Computer Science");
	// System.out.println(colleges);
     return collegeRepository.findCollegesByCourseName(courseName);
 }
}
