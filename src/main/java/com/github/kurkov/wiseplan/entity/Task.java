package com.github.kurkov.wiseplan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalTime;

/**
 * @author Aleksey Kurkov. Created on 12.02.2017
 * @version 1.0
 */
@Entity
@Table(name = "TASK")
public class Task extends AbstractEntity {

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TIME_FROM")
    private LocalTime timeFrom;

    @Column(name = "TIME_TO")
    private LocalTime timeTo;

    @Column(name = "CATEGORY")
    private TaskCategory category;

    public Task() {
    }

    public Task(String title, LocalTime timeFrom, LocalTime timeTo, TaskCategory category) {
        this.title = title;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(LocalTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public LocalTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(LocalTime timeTo) {
        this.timeTo = timeTo;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public void setCategory(TaskCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "[" + timeFrom + " - " + timeTo + "] " + title + " [" + category + "]";
    }
}