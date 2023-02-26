package com.cair.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Schedule {
    @Id
    private Long id;
    private String json;
}
