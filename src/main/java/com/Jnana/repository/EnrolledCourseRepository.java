package com.Jnana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jnana.model.EnrolledCourse;
import com.Jnana.model.EnrolledSection;

public interface EnrolledCourseRepository extends JpaRepository<EnrolledCourse, Long>{
	
	EnrolledCourse findByEnrolledSections(EnrolledSection section);

}
