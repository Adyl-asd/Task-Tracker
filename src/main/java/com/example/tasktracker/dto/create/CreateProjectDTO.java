package com.example.tasktracker.dto.create;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateProjectDTO {
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int priority;
}
