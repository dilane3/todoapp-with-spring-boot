package com.todo.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.todo.todo.entities.Todo;

@Controller()
public class TodoController {
  @GetMapping("/")
  public String index(Model model) {
    Todo todo = new Todo(1, "Learn Spring", true);
    Todo todo2 = new Todo(2, "Learn Spring MVC", true);
    Todo todo3 = new Todo(3, "Learn Spring Boot", true);
    Todo todo4 = new Todo(4, "Learn Thymeleaf", true);

    Todo[] todos = new Todo[4];

    todos[0] = todo;
    todos[1] = todo2;
    todos[2] = todo3;
    todos[3] = todo4;
    
    // model.addAttribute("todos", todos);

    return "index";
  }

  @GetMapping("/error")
  public String error(){
    return "error";
  }
}