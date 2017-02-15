package com.github.kurkov.wiseplan.dao;

import com.github.kurkov.wiseplan.entity.Task;

/**
 * @author Aleksey Kurkov. Created on 15.02.2017
 * @version 1.0
 */
public interface TaskDAO {

    void addTask(Task task);

    void removeTask(Task task);
}
