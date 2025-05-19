package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    //add task
    @PostMapping
    public Task createTask (@RequestBody Task task) {
        return taskService.save(task);
    }

    //get all tasks
    @GetMapping
    public List <Task> getAllTasks () {
        return taskService.findAll();
    }

    //refresh task
    @PutMapping("/{id}")
    public Task updateTask (@PathVariable Long id, @RequestBody Task task) {
        return taskService.udpate(id, task);
    }

    //Delete task
    @DeleteMapping({"/id"})
    public void deleteTask (@PathVariable Long id) {
        taskService.delete(id);
    }
}
