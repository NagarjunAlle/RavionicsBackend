package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.CollegeCourseDTO;
import com.app.model.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
	
	@Query("SELECT new com.app.CollegeCourseDTO(c.name, co.name, co.fee, co.duration, c.accommodation, c.accommodationFee) " +
	           "FROM College c JOIN c.courses co WHERE co.name = :courseName")
	    List<CollegeCourseDTO> findCollegesByCourseName(@Param("courseName") String courseName);

}
