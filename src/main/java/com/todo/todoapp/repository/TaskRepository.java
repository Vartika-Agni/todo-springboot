package com.todo.todoapp.repository;

import com.todo.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//repository connects application to database
public interface TaskRepository extends JpaRepository<Task, Long> {

}
