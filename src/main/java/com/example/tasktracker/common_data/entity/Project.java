package com.example.tasktracker.common_data.entity;

import com.example.tasktracker.common_data.enumeration.ProjectStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotNull
    @Size(max = 128)
    private String name;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate startDate;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate endDate;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private ProjectStatus status;

    @Column
    @NotNull
    @Min(1)
    @Max(3)
    private int priority;

    @JsonManagedReference
    @OneToMany
    @JoinTable(name = "task", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "id"))
    private List<Task> tasks = new ArrayList<>();
}
