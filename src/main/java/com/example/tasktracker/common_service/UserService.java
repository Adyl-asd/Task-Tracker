package com.example.tasktracker.common_service;

import com.example.tasktracker.common_data.entity.User;
import com.example.tasktracker.common_data.repository.UserRepository;
import com.example.tasktracker.dto.UserDTO;
import com.example.tasktracker.dto.create.CreateUserDTO;
import com.example.tasktracker.exception.UserAlreadyExistsException;
import com.example.tasktracker.exception.UserNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder _encoder;

    // Creates a new user from CreateUserDTO
    public UserDTO register(CreateUserDTO form) {
        if (userRepository.existsByEmail(form.getEmail()))
            throw new UserAlreadyExistsException();
        var user = User.builder()
                .email(form.getEmail())
                .username(form.getName())
                .password(_encoder.encode(form.getPassword()))
                .build();
        userRepository.save(user);
        return UserDTO.from(user);
    }

    // Returns a user by it's Email
    public UserDTO getByEmail(String email) {
        var user = userRepository.findByEmail(email)
                .orElseThrow(UserNotFoundException::new);
        return UserDTO.from(user);
    }
}
