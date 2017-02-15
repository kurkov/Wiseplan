package com.github.kurkov.wiseplan.service;

import com.github.kurkov.wiseplan.dao.TaskDAO;
import com.github.kurkov.wiseplan.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Aleksey Kurkov. Created on 15.02.2017
 * @version 1.0
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDAO taskDAO;

    @Transactional
    @Override
    public void addTask(Task task) {
        taskDAO.addTask(task);
    }

    @Transactional
    @Override
    public void removeTask(Task task) {
        taskDAO.removeTask(task);
    }
}