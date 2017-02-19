package com.github.kurkov.wiseplan.controller;

import com.github.kurkov.wiseplan.entity.Task;
import com.github.kurkov.wiseplan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author Aleksey Kurkov. Created on 19.02.17
 * @version 1.0
 */
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("/index")
    public String listContacts(Map<String, Object> map) {

        map.put("task", new Task());
        map.put("taskList", taskService.taskList());

        return "task";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("task") Task task,
                             BindingResult result) {

        taskService.addTask(task);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{taskId}")
    public String deleteContact(@PathVariable("taskId") Long taskId) {

        Task task = taskService.getTaskById(taskId);
        taskService.removeTask(task);

        return "redirect:/index";
    }
}
