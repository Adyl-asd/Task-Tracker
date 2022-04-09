package com.example.tasktracker.common_data.entity;

import com.example.tasktracker.common_data.enumeration.TaskStatus;
import lombok.*;

import javax.persistence.*;

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
    private String name;

    @Column
    private TaskStatus status;

    @Column
    private String description;

    @Column
    private int priority;

    @ManyToOne
    private Project project;
}
