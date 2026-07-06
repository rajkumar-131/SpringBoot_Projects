package org.example.jobapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @GetMapping("/")
    public String home() {
        return "JobApp is running successfully 🚀";
    }
}
