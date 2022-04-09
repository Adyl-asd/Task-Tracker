package com.example.tasktracker.common_service;

import com.example.tasktracker.common_data.entity.Task;
import com.example.tasktracker.common_data.repository.TaskRepository;
import com.example.tasktracker.dto.TaskDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public TaskDTO getTaskById(Long id) {
        return TaskDTO.from(repository.findById(id).orElseThrow());
    }
}
