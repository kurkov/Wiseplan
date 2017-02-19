package com.github.kurkov.wiseplan.dao;

import com.github.kurkov.wiseplan.entity.Task;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 15.02.2017
 * @version 1.0
 */
@Repository
public class TaskDAOImpl implements TaskDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Task getTaskById(Long taskId) {
        return sessionFactory.getCurrentSession().get(Task.class, taskId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Task> taskList() {
        return sessionFactory.getCurrentSession().createQuery("from Task").list();
    }

    @Override
    public void addTask(Task task) {
        sessionFactory.getCurrentSession().save(task);
    }

    @Override
    public void removeTask(Task task) {
        sessionFactory.getCurrentSession().delete(task);
    }
}
