package com.example.poc.scheduler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TaskStatusSchedulerTest {
    private TaskStatusScheduler taskStatusScheduler;

    @BeforeEach
    void setUp(){
        taskStatusScheduler = new TaskStatusScheduler();
    }

    @Test
    void updateTaskStatus() {
        taskStatusScheduler.updateTaskStatus();
    }
}