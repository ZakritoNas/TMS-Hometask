package com.example.lesson48.web;

import com.example.lesson48.dto.PersonDto;
import com.example.lesson48.service.DBUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor

@Controller
@RequestMapping()
public class UserController {

    private final DBUserDetailsService userService;

        @PostMapping("/register")
        public String save (PersonDto person){
            userService.save(person);
            return "public";
        }
}
