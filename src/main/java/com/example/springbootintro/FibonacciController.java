package com.example.springbootintro;

import java.math.BigInteger;

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
    public String handleFormSubmission(@RequestParam int num, Model model) {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger result = fibonacci.calculate(num); // Call Fibonacci class

        model.addAttribute("num", num);
        model.addAttribute("result", result); // Add result to the model
        return "result"; // Renders result.html
    }
}