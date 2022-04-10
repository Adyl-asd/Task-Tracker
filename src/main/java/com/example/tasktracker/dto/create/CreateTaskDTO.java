package com.example.tasktracker.dto.create;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateTaskDTO {

    @NotNull
    @Size(max = 128)
    private String name;

    @NotNull
    @Size(max = 512)
    private String description;

    @NotNull
    @Min(1)
    @Max(3)
    private int priority;

    @NotNull
    private Long projectId;
}
