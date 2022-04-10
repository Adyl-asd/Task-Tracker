package com.example.tasktracker.dto;

import com.example.tasktracker.common_data.entity.Task;
import com.example.tasktracker.common_data.enumeration.TaskStatus;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private TaskStatus status;

    @NotNull
    private String description;

    @NotNull
    private int priority;

    @NotNull
    private Long projectId;

    // Method maps Task entity into TaskDTO entity
    public static TaskDTO from (Task task) {
        return TaskDTO.builder()
                .id(task.getId())
                .name(task.getName())
                .status(task.getStatus())
                .description(task.getDescription())
                .priority(task.getPriority())
                .projectId(task.getProject().getId())
                .build();
    }
}
