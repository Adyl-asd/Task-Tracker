package com.example.tasktracker.common_data.entity;

import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @Column
    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @Column
    private int priority;

    @JsonManagedReference
    @OneToMany
    @JoinTable(name = "task", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "id"))
    private List<Task> tasks = new ArrayList<>();
}
