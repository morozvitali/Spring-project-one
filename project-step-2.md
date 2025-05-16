Тепер робимо першу сутність Task. Це твоя перша реальна таблиця в базі — клас, який Hibernate буде зберігати, читати й оновлювати.

✅ Крок: створення Task.java з анотацією @Entity
📄 Створи файл Task.java у пакеті:
src/main/java/com/example/taskmanager/model/Task.java

Якщо немає пакету model — створи його для зберігання сутностей.

📦 Код Task.java:
java
Copy
Edit
package com.example.taskmanager.model;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private boolean completed;

    // Конструктори
    public Task() {}

    public Task(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    // Гетери і сетери
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
🧠 Що тут відбувається?
Анотація / поле	Значення
@Entity	вказує, що це сутність (таблиця)
@Id	первинний ключ
@GeneratedValue(...)	автоінкремент, Hibernate сам призначає ID
title, completed	звичайні стовпці (Hibernate сам їх розпізнає)

✅ Після цього Hibernate сам створить таблицю task (маленькими літерами) у базі при запуску.

🔧 Коли будеш готовий — робимо TaskRepository, щоб мати змогу зберігати/читати задачі.