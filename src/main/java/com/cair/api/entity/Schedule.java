package com.cair.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Schedule {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String json;
}
