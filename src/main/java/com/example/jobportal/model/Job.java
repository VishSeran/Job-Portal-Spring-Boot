package com.example.jobportal.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Job {

    private String id;
    private  String title;
    private String description;
    private LocalDate postingDate;
    private LocalDateTime lastAccessDate;
    private int numberOfViews;

    public  Job (String id, String title, String description, LocalDate postingDate,
                       LocalDateTime lastAccessDate, int numberOfViews) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.postingDate = postingDate;
        this.lastAccessDate = lastAccessDate;
        this. numberOfViews = numberOfViews;


    }
    public String getTitle() {
        return title;
    }
}
