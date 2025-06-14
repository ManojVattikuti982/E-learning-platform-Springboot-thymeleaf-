package com.Jnana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jnana.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
	
	boolean existsByMobile(long mobile);

	boolean existsByEmail(String email);
	
	Tutor findByEmail(String email);
	
}
