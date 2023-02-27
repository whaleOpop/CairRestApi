package com.cair.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="teacher")
public class Teacher {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String fio;
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    private String github;
    private String photo;
}
