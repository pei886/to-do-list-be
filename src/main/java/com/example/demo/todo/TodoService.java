package com.example.demo.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todoList = List.of(
            new Todo(
                    0,
                    "Do hw",
                    "Math 1-10",
                    0
            ),
            new Todo(
                    1,
                    "Sweep floor",
                    "Nil",
                    0
            )
    );

    List<Todo> todolist = new ArrayList<>(todoList);

    public List<Todo> getTodo() {
        return todolist;
    }

    public List<Todo> toggleTodo(Integer inputID) {
        for (Todo todo : todolist) {
            if (todo.getId() == inputID) {
                if (todo.getStatus() == 0) {
                    todo.setStatus(1);
                } else {
                    todo.setStatus(0);
                }
            }
        }
        System.out.println(todolist);
        return todolist;
    }

    public void addTodo(Todo todo) {
        if (todolist.isEmpty()) {
            todo.setId(0);
        }
        else {
            Integer newId = todolist.get(todolist.size() - 1).getId() + 1;
            todo.setId(newId);
        }
        todolist.add(todo);
    }

    public List<Todo> deleteTodo(Integer InputID) {
        Iterator<Todo> iterator = todolist.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId().equals(InputID)) {
                iterator.remove();
                break;
            }
        }
        return todolist;
    }
}
//        {id:0, name:"Do Homework",details:"page 1-10", status:0},
//        {id:1, name:"Feed Bailey",details:"page 1-10", status:0},
//        {id:2, name:"Clean the dishes",details:"page 1-10", status:0},
//        {id:3, name:"Sweep the floor",details:"page 1-10", status:0},