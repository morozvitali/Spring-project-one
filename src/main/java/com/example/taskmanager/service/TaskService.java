package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task save (Task task) {
        return taskRepository.save(task);
    }
    public List <Task> findAll () {
        return taskRepository.findAll();
    }

    public Task udpate (Long id, Task updatedTask) {
        Task existing = taskRepository.findById(id).orElseThrow();
        existing.setTitle(updatedTask.getTitle());
        existing.setCompleted(updatedTask.isCompleted());
        return taskRepository.save(existing);
    }

    public void delete (Long id) {
        taskRepository.deleteById(id);
    }
}
