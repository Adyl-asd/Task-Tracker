package com.example.tasktracker.common_data.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProjectStatus {
    NOT_STARTED("NotStarted"),
    ACTIVE("Active"),
    COMPLETED("Completed");

    private final String name;
}
