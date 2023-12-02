package com.example.lessson40.web;


import com.example.lessson40.domain.FilmEntity;
import com.example.lessson40.dto.FilmCreateDto;
import com.example.lessson40.mapper.FilmMapper;
import com.example.lessson40.service.impl.FilmServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor

@Controller
@RequestMapping
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
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        FilmEntity film = mapper.toEntity(filmDto);
        service.save(film);
        modelAndView.addObject("film", filmDto);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@RequestParam(name="id", required = true) Integer id,
                               @RequestParam(name="newrating", required = false) Integer rating){
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        service.updateRating(id, rating);
        List<FilmEntity> all = service.findAll();
        modelAndView.addObject("film", all);
        return modelAndView;
    }
}
