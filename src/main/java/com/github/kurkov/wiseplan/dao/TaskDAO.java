package com.github.kurkov.wiseplan.dao;

import com.github.kurkov.wiseplan.entity.Task;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 15.02.2017
 * @version 1.0
 */
public interface TaskDAO {

    Task getTaskById(Long taskId);

    List taskList();

    void addTask(Task task);

    void removeTask(Task task);
}
