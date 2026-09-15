package ru.kafpin.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        model.addAttribute("data", "Лабораторная работа N1");
        model.addAttribute("content", "Знакомство с Spring Framework");
        return "main";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name = "name", required = false, defaultValue = "Имя автора") String authorName, Model model) {
        model.addAttribute("title", "Страница автора");
        model.addAttribute("author", authorName);
        return "about";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "main-form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute Student student, Model model) {
        student.generateGroupAndLogin();
        model.addAttribute("student", student);
        return "result";
    }
}