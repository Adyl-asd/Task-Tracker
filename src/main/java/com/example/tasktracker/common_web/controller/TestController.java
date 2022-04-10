package com.example.tasktracker.common_web.controller;

import com.example.tasktracker.common_data.entity.Project;
import com.example.tasktracker.common_service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {

    private final ProjectService service;

    @GetMapping("/test")
    public List<Project> getProjects() {
        return service.getAllProjects();
    }
}
