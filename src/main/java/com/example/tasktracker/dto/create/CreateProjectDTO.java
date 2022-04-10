package com.example.tasktracker.dto.create;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateProjectDTO {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private int priority;
}
