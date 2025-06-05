package com.Jnana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jnana.model.Learner;

public interface LearnerRepository extends JpaRepository<Learner, Long> {

	boolean existsByMobile(long mobile);

	boolean existsByEmail(String email);
	
	Learner findByEmail(String email);

}
