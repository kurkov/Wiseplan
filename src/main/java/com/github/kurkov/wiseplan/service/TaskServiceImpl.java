package com.github.kurkov.wiseplan.service;

import com.github.kurkov.wiseplan.dao.TaskDAO;
import com.github.kurkov.wiseplan.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public Task getTaskById(Long taskId) {
        return taskDAO.getTaskById(taskId);
    }

    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public List<Task> taskList() {
        return taskDAO.taskList();
    }

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
