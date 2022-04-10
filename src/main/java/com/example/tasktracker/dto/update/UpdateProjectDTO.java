package com.example.tasktracker.dto.update;

import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
public class UpdateProjectDTO {
    @NotNull
    @Size(max = 128)
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate endDate;

    @NotNull
    @Min(1)
    @Max(3)
    private int priority;

    @NotNull
    private ProjectStatus status;

}
