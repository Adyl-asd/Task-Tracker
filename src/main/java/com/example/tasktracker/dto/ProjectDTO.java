package com.example.tasktracker.dto;

import com.example.tasktracker.common_data.entity.Project;
import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {
    private Long id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ProjectStatus status;
    private int priority;

    // Method maps Project entity into ProjectDTO entity
    public static ProjectDTO from(Project project) {
        return ProjectDTO.builder()
                .id(project.getId())
                .name(project.getName())
                .startDate(project.getStartDate())
                .endDate(project.getEndDate())
                .status(project.getStatus())
                .priority(project.getPriority())
                .build();
    }
}
