package com.example.poc.entity;

import com.example.poc.dto.TaskDto;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ProtocolEntity {
    private UUID id;
    private String patientId;
    private List<TaskDto> tasks;
}
