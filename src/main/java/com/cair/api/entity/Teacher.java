package com.cair.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Teacher {
    @Id
    private Long id;
    private String fio;
    private String email;
    private String login;
    private String password;
    private String github;
    private String photo;
}
