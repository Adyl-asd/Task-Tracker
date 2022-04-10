package com.example.tasktracker.dto.update;

import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateProjectDTO {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ProjectStatus status;
    private int priority;
}
