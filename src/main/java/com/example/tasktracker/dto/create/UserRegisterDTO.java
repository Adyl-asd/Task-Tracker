package com.example.tasktracker.dto.create;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserRegisterDTO {
    private String email = "";
    private String name = "";
    private String password = "";
}
