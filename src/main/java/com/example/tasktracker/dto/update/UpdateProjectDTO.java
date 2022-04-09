package com.example.tasktracker.dto.update;

import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UpdateProjectDTO {
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ProjectStatus status;
    private int priority;
}
