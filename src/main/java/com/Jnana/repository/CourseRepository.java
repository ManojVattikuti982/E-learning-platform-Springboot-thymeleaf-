package com.Jnana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jnana.model.Course;
import com.Jnana.model.Tutor;

public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findByTutor(Tutor attribute);

	List<Course> findByPublishedTrue();

}
