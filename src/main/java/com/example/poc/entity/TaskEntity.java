package com.example.poc.entity;

import lombok.Data;

import java.time.Instant;

@Data
public class TaskEntity {
    private Long taskId;
    private String type;
    private Instant dueDate;
}
