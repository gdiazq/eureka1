package com.iteureka.semana1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iteureka.semana1.service.CustomerService;
import com.iteureka.semana1.model.CustomerEntity;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public Iterable<CustomerEntity> getAllCustomer() {
        return customerService.findAll();
    }

    @GetMapping ("/{id}") 
        public Optional<CustomerEntity> getCustomerById(@PathVariable Long id) {
            return customerService.findById(id);
        }
    
    
}
