package com.iteureka.semana1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iteureka.semana1.model.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

}
