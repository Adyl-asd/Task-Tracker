package com.example.tasktracker.common_service;

import com.example.tasktracker.common_data.entity.Project;
import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import com.example.tasktracker.common_data.repository.ProjectRepository;
import com.example.tasktracker.dto.ProjectDTO;
import com.example.tasktracker.dto.create.CreateProjectDTO;
import com.example.tasktracker.dto.update.UpdateProjectDTO;
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

    public Project getProjectById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public ProjectDTO getProjectDTOById(Long id) {
        return ProjectDTO.from(getProjectById(id));
    }

    public ProjectDTO createProject(CreateProjectDTO dto) {
        Project project = repository.save(Project.builder()
                .name(dto.getName())
                .startDate(dto.getStartDate())
                .endDate(dto.getEndDate())
                .priority(dto.getPriority())
                .status(ProjectStatus.NOT_STARTED)
                .build());
        return ProjectDTO.from(project);
    }

    public ProjectDTO updateProject(Long id, UpdateProjectDTO dto) {
        Project project = getProjectById(id);
        project.setName(dto.getName());
        project.setStartDate(dto.getStartDate());
        project.setEndDate(dto.getEndDate());
        project.setPriority(dto.getPriority());
        project.setStatus(dto.getStatus());
        repository.save(project);
        return ProjectDTO.from(project);
    }

    public String deleteProject(Long id) {
        repository.deleteById(id);
        return "Project with id " + id + " has been deleted";
    }
}
