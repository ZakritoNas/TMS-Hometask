package com.example.lessson39.web;

import com.example.lessson39.domain.FilmEntity;
import com.example.lessson39.dto.FilmCreateDto;
import com.example.lessson39.mapper.FilmMapper;
import com.example.lessson39.service.impl.FilmServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor

@Controller
@RequestMapping("/home")
public class HomeController {

    private final FilmMapper mapper;
    private final FilmServiceImpl service;
    private final String HOME_PAGE = "home";

    @GetMapping("/")
    public ModelAndView homePage(@ModelAttribute(name="film") FilmEntity film){
        ModelAndView modelAndView = new ModelAndView(HOME_PAGE);
        modelAndView.addObject("films", service.findAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save (@ModelAttribute(name="film") FilmCreateDto filmDto, BindingResult result){
        ModelAndView modelAndView = new ModelAndView("home");
        FilmEntity film = mapper.toEntity(filmDto);
        service.save(film);
        modelAndView.addObject("film", new FilmCreateDto());
        return modelAndView;
    }

}
