package com.github.kurkov.wiseplan.service;

import com.github.kurkov.wiseplan.entity.Task;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 15.02.2017
 * @version 1.0
 */
public interface TaskService {

    Task getTaskById(Long taskId);

    List<Task> taskList();

    void addTask(Task task);

    void updateTask(Task task);

    void removeTask(Long taskId);
}
