package com.example.demo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "todolist")
@CrossOrigin(origins= "http://localhost:5173/")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodo() {
        return todoService.getTodo();
    }

    @PostMapping
    public List<Todo> toggleTodo(@RequestBody String inputID) {
        int num = Integer.parseInt(inputID);
        todoService.toggleTodo(num);
        return todoService.getTodo();
    }

    @PostMapping("/add")
    public List<Todo> addTodo(@RequestBody Todo addTask) {
        todoService.addTodo(addTask);
        return todoService.getTodo();
    };

    @PostMapping("/del")
    public List<Todo> delTodo(@RequestBody String inputID) {
        int num = Integer.parseInt(inputID);
        todoService.deleteTodo(num);
        return todoService.getTodo();
    }
}
