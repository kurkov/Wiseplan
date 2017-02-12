package com.github.kurkov.wiseplan.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

/**
 * @author Aleksey Kurkov. Created on 12.02.2017
 * @version 1.0
 */
class TaskTest {

    @Test
    @DisplayName("Create new task and check toString method")
    void createNewTask_CheckToStringMethod() {
        String expected = "[07:00 - 08:00] Read a book Spring in Action [2]";
        Task task = new Task("Read a book Spring in Action", LocalTime.of(7,0), LocalTime.of(8,0), TaskCategory.SECOND);
        String actual = task.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check duration")
    void checkDuration() {
        Long expected = 60L;
        Task task = new Task("Read a book Spring in Action", LocalTime.of(7,0), LocalTime.of(8,0), TaskCategory.SECOND);
        Long actual = task.getDuration();
        Assertions.assertEquals(expected, actual);
    }
}