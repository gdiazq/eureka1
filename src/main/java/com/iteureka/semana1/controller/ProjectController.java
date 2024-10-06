package com.iteureka.semana1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iteureka.semana1.model.ProjectEntity;
import com.iteureka.semana1.service.ProjectService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/project")
@AllArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public Iterable<ProjectEntity> getAllProject() {
        return projectService.findAll();
    }
}
