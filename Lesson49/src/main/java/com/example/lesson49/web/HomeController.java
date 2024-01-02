package com.example.lesson49.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HomeController {
    @GetMapping("/public")
    public void publicPage (){
        System.out.println();
    }
    @GetMapping("/private")
    public String privatePage (){
        return "private";
    }
    @GetMapping("/admin")
    public String adminPage (){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return (String)authentication.getPrincipal();
    }
}
