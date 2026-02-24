package com.example.jobportal.controller;

import com.example.jobportal.model.Job;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class JobController {

   private ArrayList<Job> jobList ;

    @GetMapping("/jobs")
    public ArrayList<Job> listJobs() {
        System.out.println("Here are the jobs list");

        for (Job job : jobList ) {
            job.setLastAccessDate(LocalDateTime.now());
            job.addNumViews();
        }

        return jobList;
    }

    @PostConstruct
    public void init() {
        Job job1 = new Job ("1", "Software Engineer", "Develop software applications", LocalDate.now(), LocalDateTime.now(), 0);
        Job job2 = new Job("2", "Data Scientist", "Analyze data and develop models", LocalDate.now(), LocalDateTime.now(), 0);

        jobList = new ArrayList<>();
        jobList.add(job1);
        jobList.add(job2);
    }
}
