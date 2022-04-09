package com.example.tasktracker.common_service;

import com.example.tasktracker.common_data.entity.Project;
import com.example.tasktracker.common_data.repository.ProjectRepository;
import com.example.tasktracker.dto.ProjectDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectService {
    private final ProjectRepository repository;

    public List<Project> getAllProjects() {
        return repository.findAll();
    }

    // ДОБАВИТЬ ВАЛИДАЦИЮ
    public ProjectDTO getProjectById(Long id) {
        return ProjectDTO.from(repository.findById(id).orElseThrow());
    }
}
