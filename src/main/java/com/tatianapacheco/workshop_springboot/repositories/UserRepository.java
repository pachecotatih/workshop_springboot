package com.tatianapacheco.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatianapacheco.workshop_springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
