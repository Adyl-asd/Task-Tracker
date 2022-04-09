package com.example.tasktracker.common_data.entity;

import lombok.*;

import javax.persistence.*;


@Data
@Table(name = "user")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    @Builder.Default
    private boolean active = true;

    @Column
    @Builder.Default
    private String role = "USER";

}
