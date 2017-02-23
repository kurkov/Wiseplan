package com.github.kurkov.wiseplan.service;

import com.github.kurkov.wiseplan.dao.TaskDAO;
import com.github.kurkov.wiseplan.entity.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 15.02.2017
 * @version 1.0
 */
@Service
public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO;

    public void setTaskDAO(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @Override
    @Transactional
    public Task getTaskById(Long taskId) {
        return taskDAO.getTaskById(taskId);
    }

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Task> taskList() {
        return taskDAO.taskList();
    }

    @Override
    @Transactional
    public void addTask(Task task) {
        taskDAO.addTask(task);
    }

    @Override
    @Transactional
    public void updateTask(Task task) {
        taskDAO.updateTask(task);
    }

    @Override
    @Transactional
    public void removeTask(Long taskId) {
        taskDAO.removeTask(taskId);
    }
}
