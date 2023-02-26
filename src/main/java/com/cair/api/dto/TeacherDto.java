package com.cair.api.dto;

import lombok.Data;

@Data
public class TeacherDto {
    private Long id;
    private String fio;
    private String email;
    private String login;
    private String password;
    private String github;
    private String photo;
}
