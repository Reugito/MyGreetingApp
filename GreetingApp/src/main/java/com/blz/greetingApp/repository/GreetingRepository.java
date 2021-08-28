package com.blz.greetingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blz.greetingApp.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long >{

}
