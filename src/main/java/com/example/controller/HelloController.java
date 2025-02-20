package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    @ResponseBody
    public String sayHello() {
        return "Hello, Spring MVC!";
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable("name") String name, Model model) {
            model.addAttribute("name", name);
        return "greeting"; // Вернёт greeting.jsp
}
}
