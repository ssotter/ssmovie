package com.ssotter.ssmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssotter.ssmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
