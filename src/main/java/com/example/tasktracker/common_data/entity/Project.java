package com.example.tasktracker.common_data.entity;

import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "project")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDateTime startDate;

    @Column
    private LocalDateTime endDate;

    @Column
    private ProjectStatus status;

    @Column
    private int priority;
}
