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

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription () {
        return description;
    }

    public LocalDate getPostingDate () {
        return postingDate;
    }

    public LocalDateTime getLastAccessDate() {
        return lastAccessDate;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setId (String id) {
        this.id = id;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public void setPostingDate (LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public void setLastAccessDate (LocalDateTime lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }

    public void setNumberOfViews (int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public void addNumViews () {
        numberOfViews ++;
    }

    public String toString () {
        return this.id + " "+ this.title + "\n"+
                this.description + "\n" + "Posted on " + this.postingDate + "\n" +
                "Last access on " + this.lastAccessDate + "\n" +
                "Total views " + this.numberOfViews;
    }

}
