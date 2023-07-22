package com.fj.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fj.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
