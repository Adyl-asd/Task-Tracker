package com.example.tasktracker.dto.create;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskDTO {
    private String name;
    private String description;
    private int priority;
}
