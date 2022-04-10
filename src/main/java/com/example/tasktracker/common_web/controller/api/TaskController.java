package com.example.tasktracker.common_web.controller.api;

import com.example.tasktracker.common_data.entity.Task;
import com.example.tasktracker.common_service.TaskService;
import com.example.tasktracker.dto.TaskDTO;
import com.example.tasktracker.dto.create.CreateTaskDTO;
import com.example.tasktracker.dto.update.UpdateTaskDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@AllArgsConstructor
@RequestMapping("/api/task")
public class TaskController {
    private final TaskService service;

    @GetMapping("/{id}")
    public TaskDTO getTaskById(@PathVariable Long id) {
        return service.getTaskDTOById(id);
    }

    @PostMapping
    public TaskDTO createTask(@Valid CreateTaskDTO dto) {
        return service.createTask(dto);
    }

    @PutMapping("/{id}")
    public TaskDTO updateTask(@PathVariable Long id,
                              @Valid UpdateTaskDTO dto) {
        return service.updateTask(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        return service.deleteTask(id);
    }
}
