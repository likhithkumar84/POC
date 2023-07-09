package com.example.poc.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableScheduling
@RequiredArgsConstructor
public class TaskStatusScheduler {

    @Scheduled(cron = "${scheduling.job.cron}")
    public void updateTaskStatus() {
        log.info("Scheduler Started");
        log.info("Scheduler Completed");
    }

}
