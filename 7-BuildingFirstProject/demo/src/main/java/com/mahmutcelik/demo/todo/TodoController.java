package com.mahmutcelik.demo.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("list-todos")
    public String getListTodos(ModelMap model){
        model.addAttribute("todos",todoService.findByUsername());
        return "listTodos";
    }

    @GetMapping("add-todo")
    public String getAddTodo(){
        return "addTodo";
    }

    @PostMapping("add-todo")
    public String addNewTodo(@RequestParam("description") String newDescription , ModelMap model){
        //implement add new to do configuration
        todoService.addNewTodo(String.valueOf(model.get("name")),newDescription, LocalDate.now().plusYears(1),false);

        return "redirect:list-todos";
    }




}
