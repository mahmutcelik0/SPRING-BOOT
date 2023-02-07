package com.mahmutcelik.demo.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("list-todos")
    public String getListTodos(ModelMap model){
        model.addAttribute("todos",todoService.findByUsername("mahmut"));
        return "listTodos";
    }






}
