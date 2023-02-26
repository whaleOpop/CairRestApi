package com.cair.api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Group {
    @Id
    private Long id;
    private Long student_id;
    private Long schedule_id;
    private String name;
    private Long teacher_id;
}
