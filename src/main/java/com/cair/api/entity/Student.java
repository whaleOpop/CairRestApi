package com.cair.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String fio;
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    private Integer scores;
    private String github;
    private String photo;
}
