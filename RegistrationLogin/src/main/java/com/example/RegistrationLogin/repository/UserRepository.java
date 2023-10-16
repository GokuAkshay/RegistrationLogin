package com.example.RegistrationLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RegistrationLogin.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails,Integer> {

	

}
