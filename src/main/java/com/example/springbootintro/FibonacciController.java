package com.example.springbootintro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FibonacciController {

    @GetMapping("/form")
    public String showForm() {
        return "form"; // Renders form.html
    }

    @PostMapping("/submit")
    public String handleFormSubmission(@RequestParam String name, @RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "result"; // Renders result.html
    }
}