package com.example.tasktracker.common_service;

import com.example.tasktracker.common_data.entity.Task;
import com.example.tasktracker.common_data.enumeration.TaskStatus;
import com.example.tasktracker.common_data.repository.TaskRepository;
import com.example.tasktracker.dto.TaskDTO;
import com.example.tasktracker.dto.create.CreateTaskDTO;
import com.example.tasktracker.dto.update.UpdateTaskDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repository;
    private final ProjectService projectService;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public TaskDTO getTaskDTOById(Long id) {
        return TaskDTO.from(getTaskById(id));
    }

    public TaskDTO createTask(Long projectId, CreateTaskDTO dto) {
        Task task = repository.save(Task.builder()
                .name(dto.getName())
                .status(TaskStatus.TO_DO)
                .description(dto.getDescription())
                .priority(dto.getPriority())
                .project(projectService.getProjectById(projectId))
                .build());
        return TaskDTO.from(task);
    }

    public TaskDTO updateTask(Long id, UpdateTaskDTO dto) {
        Task task = getTaskById(id);
        task.setName(dto.getName());
        task.setStatus(dto.getStatus());
        task.setDescription(dto.getDescription());
        task.setPriority(dto.getPriority());
        repository.save(task);
        return TaskDTO.from(task);
    }

    public String deleteTask(Long id) {
        repository.deleteById(id);
        return "Task with id " + id + " has been deleted";
    }
}
