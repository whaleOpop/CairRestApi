package com.cair.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String fio;
    private String email;
    private String login;
    private String password;
    private Integer scores;
    private String github;
    private String photo;
}
