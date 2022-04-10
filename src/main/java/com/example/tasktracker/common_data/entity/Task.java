package com.example.tasktracker.common_data.entity;

import com.example.tasktracker.common_data.enumeration.TaskStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Table(name = "task")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    @Size(max = 128)
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private TaskStatus status;

    @Column
    @NotNull
    @Size(max = 512)
    private String description;

    @Column
    @NotNull
    @Min(1)
    @Max(3)
    private int priority;

    @ManyToOne
    @JsonBackReference
    private Project project;
}
