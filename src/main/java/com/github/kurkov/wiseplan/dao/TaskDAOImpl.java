package com.github.kurkov.wiseplan.dao;

import com.github.kurkov.wiseplan.entity.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 15.02.2017
 * @version 1.0
 */
@Repository
public class TaskDAOImpl implements TaskDAO {

    private static final Logger logger = LoggerFactory.getLogger(TaskDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Task getTaskById(Long taskId) {
        Session session = sessionFactory.getCurrentSession();
        Task task = (Task) session.load(Task.class, taskId);
        logger.info("Task loaded successfully, Task details=" + task);
        return task;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Task> taskList() {
        Session session = sessionFactory.getCurrentSession();
        List<Task> taskList = session.createQuery("from Task").list();
        for (Task task : taskList) {
            logger.info("Task List::" + task);
        }
        return taskList;
    }

    @Override
    public void addTask(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(task);
        logger.info("Task saved successfully, Task Details=" + task);
    }

    @Override
    public void updateTask(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.update(task);
        logger.info("Task updated successfully, Task Details=" + task);
    }

    @Override
    public void removeTask(Long taskId) {
        Session session = sessionFactory.getCurrentSession();
        Task task = (Task) session.load(Task.class, taskId);
        if (task != null) {
            session.delete(task);
        }
        logger.info("Task deleted successfully, Task Details=" + task);
    }
}