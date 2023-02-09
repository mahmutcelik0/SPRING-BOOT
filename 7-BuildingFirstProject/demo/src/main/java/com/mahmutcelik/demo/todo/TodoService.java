package com.mahmutcelik.demo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();

    static {
        todoList.add(new Todo(1,"a","LEARN SPRING BOOT", LocalDate.now().plusYears(1),true));
        todoList.add(new Todo(2,"a","LEARN SPRING BOOT", LocalDate.now().plusYears(1),true));
        todoList.add(new Todo(3,"a","LEARN SPRING BOOT", LocalDate.now().plusYears(1),true));
        todoList.add(new Todo(4,"a","LEARN SPRING BOOT", LocalDate.now().plusYears(1),true));
    }


    public List<Todo> findByUsername(){
        return todoList;
    }

    public void addNewTodo(String username,String description, LocalDate targetDate, boolean isDone){
        todoList.add(new Todo(todoList.size()+1, username,description,targetDate,isDone));
    }


}
