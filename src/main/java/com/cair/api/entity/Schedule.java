package com.cair.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="schedule")
public class Schedule {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String json;
}
