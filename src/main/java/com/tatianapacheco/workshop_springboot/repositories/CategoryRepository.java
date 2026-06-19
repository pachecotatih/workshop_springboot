package com.tatianapacheco.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatianapacheco.workshop_springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
