package com.mahmutcelik.demo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();

    static {
        todoList.add(new Todo(1,"mahmut","LEARN SPRING BOOT", LocalDate.now().plusYears(1),true));
        todoList.add(new Todo(2,"mahmut","LEARN SPRING BOOT", LocalDate.now(),true));
        todoList.add(new Todo(3,"mahmut","LEARN SPRING BOOT", LocalDate.now(),true));
        todoList.add(new Todo(4,"mahmut","LEARN SPRING BOOT", LocalDate.now(),true));
    }


    public List<Todo> findByUsername(String username){
//        Predicate<? super Todo> predicate =
//                todo -> todo.getUsername().equalsIgnoreCase(username);
//        return todoList.stream().filter(predicate).toList();

        return todoList;
    }




}
