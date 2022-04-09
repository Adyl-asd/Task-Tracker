package com.example.tasktracker.dto.create;

import com.example.tasktracker.common_data.enumeration.TaskStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskDTO {
    private String name;
    private TaskStatus status;
    private String description;
    private int priority;
    private Long projectId;
}
