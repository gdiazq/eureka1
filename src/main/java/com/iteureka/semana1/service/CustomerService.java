package com.iteureka.semana1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.iteureka.semana1.model.CustomerEntity;
import com.iteureka.semana1.repository.CustomerRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class CustomerService{

    private final CustomerRepository customerRepository;

    @GetMapping
    public Iterable<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }

    
}
