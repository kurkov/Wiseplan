package com.github.kurkov.wiseplan.controller;

import com.github.kurkov.wiseplan.entity.Task;
import com.github.kurkov.wiseplan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Aleksey Kurkov. Created on 19.02.17
 * @version 1.0
 */
@Controller
public class TaskController {

    private TaskService taskService;

    @Autowired(required = true)
    @Qualifier(value = "taskService")
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String listContacts(Model model) {
        model.addAttribute("task", new Task());
        model.addAttribute("taskList", taskService.taskList());
        return "task";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/tasks";
    }

    //For add and update task both
    @RequestMapping(value = "/task/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("task") Task task) {
        if (task.getId() == 0) {
            //new task, add it
            taskService.addTask(task);
        } else {
            //existing task, call update
            taskService.updateTask(task);
        }

        return "redirect:/tasks";
    }

    @RequestMapping("/delete/{taskId}")
    public String deleteTask(@PathVariable("taskId") Long taskId) {
        taskService.removeTask(taskId);
        return "redirect:/tasks";
    }

    @RequestMapping("/edit/{taskId}")
    public String editTask(@PathVariable("taskId") Long taskId, Model model) {
        model.addAttribute("task", taskService.getTaskById(taskId));
        model.addAttribute("listTasks", taskService.taskList());
        return "task";
    }
}
