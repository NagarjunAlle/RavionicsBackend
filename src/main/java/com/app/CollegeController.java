package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.College;
import com.app.service.CollegeService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/colleges")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/details")
    public List<CollegeCourseDTO> getCollegeDetailsWithCourses() {
        return collegeService.getCollegeDetailsWithCourses();
    }
    
    @GetMapping("/byCourse")
    public List<CollegeCourseDTO> getCollegesByCourse(@RequestParam String courseName) {
        return collegeService.getCollegesByCourseName(courseName);
    }
}