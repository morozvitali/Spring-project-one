package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

/*

JpaRepository автоматично створює для тебе готові методи:

Метод	                Опис

save(Task task)	        Зберігає або оновлює задачу
findById(Long id)	    Шукає задачу по ID
findAll()	            Повертає всі задачі
deleteById(Long id)	    Видаляє задачу по ID
existsById(Long id)	    Перевіряє, чи існує задача

не треба писати жодної реалізації — Spring сам усе зробить!

 */