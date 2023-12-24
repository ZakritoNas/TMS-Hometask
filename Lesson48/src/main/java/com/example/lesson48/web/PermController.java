package com.example.lesson48.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PermController {
    @GetMapping("special")
        public String special(){
            return "special";
        }

    @GetMapping("user")
    public String user(){
        return "user";
    }
}
