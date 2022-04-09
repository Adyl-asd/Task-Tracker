package com.example.tasktracker.common_data.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {
    TO_DO("ToDo"),
    IN_PROGRESS("InProgress"),
    DONE("Done");

    private final String name;
}
