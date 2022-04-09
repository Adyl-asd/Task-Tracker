package com.example.tasktracker.dto;

import com.example.tasktracker.common_data.entity.Task;
import com.example.tasktracker.common_data.enumeration.TaskStatus;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    private Long id;
    private String name;
    private TaskStatus status;
    private String description;
    private int priority;
    private ProjectDTO project;

    // Method maps Task entity into TaskDTO entity
    public static TaskDTO from (Task task) {
        return TaskDTO.builder()
                .id(task.getId())
                .name(task.getName())
                .status(task.getStatus())
                .description(task.getDescription())
                .priority(task.getPriority())
                .project(ProjectDTO.from(task.getProject()))
                .build();
    }
}
