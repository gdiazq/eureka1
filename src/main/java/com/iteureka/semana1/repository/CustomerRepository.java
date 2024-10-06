package com.iteureka.semana1.repository;

import org.springframework.data.repository.CrudRepository;

import com.iteureka.semana1.model.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
}
