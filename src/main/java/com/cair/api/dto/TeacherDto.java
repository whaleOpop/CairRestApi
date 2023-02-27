package com.cair.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TeacherDto {

    private Long id;

    @NotBlank(message = "Необходимо заполнить фио")
    private String fio;

    @Email(message = "Email должен быть корректным адрессом электронной почты")
    private String email;

    @NotBlank(message = "Необходимо заполнить логин")
    private String login;

    @NotBlank(message = "Необходимо заполнить пароль")
    private String password;

    private String github;

    private String photo;
}
