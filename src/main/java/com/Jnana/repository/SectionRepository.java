package com.Jnana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jnana.model.Course;
import com.Jnana.model.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

	List<Section> findByCourse(Course course);

}
