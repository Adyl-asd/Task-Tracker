package com.example.tasktracker.common_web.controller.main;

import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import com.example.tasktracker.common_data.enumeration.TaskStatus;
import com.example.tasktracker.common_service.ProjectService;
import com.example.tasktracker.common_service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class MainController {
    private final ProjectService projectService;
    private final TaskService taskService;

    // Main page with all projects
    @GetMapping
    public String getProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "projects";
    }

    // Single project page
    @GetMapping("/project/{id}")
    public String getProjectById(@PathVariable Long id,
                                 Model model) {
        model.addAttribute("project", projectService.getProjectById(id));
        return "project";
    }

    // Create new project page
    @GetMapping("/project/new")
    public String createProject() {
        return "project_create";
    }

    // Edit project page
    @GetMapping("/project/{id}/edit")
    public String updateProject(@PathVariable Long id,
                                Model model) {
        model.addAttribute("project", projectService.getProjectById(id));
        model.addAttribute("statuses", ProjectStatus.values());
        return "project_update";
    }

    // Delete project page
    @GetMapping("/project/{id}/delete")
    public String deleteProject(@PathVariable Long id,
                                Model model) {
        model.addAttribute("project", projectService.getProjectById(id));
        return "project_delete";
    }

    // Single task page
    @GetMapping("/project/{id}/task/{taskId}")
    public String getTaskById(@PathVariable Long id,
                              @PathVariable Long taskId,
                              Model model) {
        model.addAttribute("task", taskService.getTaskById(taskId));
        return "task";
    }

    // Create new task page
    @GetMapping("/project/{id}/task/new")
    public String createTask(@PathVariable Long id,
                             Model model) {
        model.addAttribute("projectId", id);
        return "task_create";
    }

    // Edit task page
    @GetMapping("/project/{id}/task/{taskId}/edit")
    public String updateTask(@PathVariable Long id,
                             @PathVariable Long taskId,
                             Model model) {
        model.addAttribute("task", taskService.getTaskById(taskId));
        model.addAttribute("projectId", id);
        model.addAttribute("statuses", TaskStatus.values());
        return "task_update";
    }

    // Delete task page
    @GetMapping("/project/{id}/task/{taskId}/delete")
    public String deleteTask(@PathVariable Long id,
                             @PathVariable Long taskId,
                             Model model) {
        model.addAttribute("task", taskService.getTaskById(taskId));
        model.addAttribute("projectId", id);
        return "task_delete";
    }
}
