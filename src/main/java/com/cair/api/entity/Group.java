package com.cair.api.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Group {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private Long student_id;
    private Long schedule_id;
    private String name;
    private Long teacher_id;
}
