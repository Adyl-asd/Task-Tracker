package com.example.tasktracker.common_web.controller.api;

import com.example.tasktracker.common_data.entity.Project;
import com.example.tasktracker.common_service.ProjectService;
import com.example.tasktracker.dto.ProjectDTO;
import com.example.tasktracker.dto.create.CreateProjectDTO;
import com.example.tasktracker.dto.update.UpdateProjectDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/project")
public class ProjectController {
    private final ProjectService service;

    // Returns all projects
    @GetMapping()
    public List<Project> getAllProjects() {
        return service.getAllProjects();
    }

    // Returns one project found by id
    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return service.getProjectById(id);
    }

    // Creates a new project
    @PostMapping()
    public ProjectDTO createProject(@Valid CreateProjectDTO dto) {
        return service.createProject(dto);
    }

    // Updates existing project by id
    @PutMapping("/{id}")
    public ProjectDTO updateProject(@PathVariable Long id,
                                    @Valid UpdateProjectDTO dto) {
        return service.updateProject(id, dto);
    }

    // Deletes existing project by id
    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id) {
        return service.deleteProject(id);
    }
}
