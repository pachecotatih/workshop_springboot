package com.tatianapacheco.workshop_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatianapacheco.workshop_springboot.entities.Category;
import com.tatianapacheco.workshop_springboot.repositories.CategoryRepository;
import com.tatianapacheco.workshop_springboot.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));

    }
}
