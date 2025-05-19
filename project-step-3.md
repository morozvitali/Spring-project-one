Тепер, коли в нас є сутність Task, ми зробимо для неї репозиторій, 
тобто об'єкт, через який Spring буде зберігати, шукати та видаляти задачі в базі.

✅ Крок: створення TaskRepository
📄 Створи інтерфейс у пакеті:
src/main/java/com/example/taskmanager/repository/TaskRepository.java

Якщо пакету repository ще нема — створи.

📦 Код TaskRepository.java:

package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
// Тут можна додавати кастомні методи, якщо треба
}
🧠 Що це дає?
JpaRepository автоматично створює для тебе готові методи:

Метод	Опис
save(Task task)	Зберігає або оновлює задачу
findById(Long id)	Шукає задачу по ID
findAll()	Повертає всі задачі
deleteById(Long id)	Видаляє задачу по ID
existsById(Long id)	Перевіряє, чи існує задача

📌 І головне: тобі не треба писати жодної реалізації — Spring сам усе зробить!

📣 Коли зробиш — напиши готово, і ми переходимо 
до TaskService для бізнес-логіки, а після цього — до REST-контролера.