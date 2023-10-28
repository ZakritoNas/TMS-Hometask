package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.domain.Contract;
import org.example.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@ControllerAdvice
@RequestMapping("/mypage")
public class MyController {

private final ContractService contractService;

    @GetMapping
    public ModelAndView page(@ModelAttribute Contract contract){
        ModelAndView modelAndView = new ModelAndView("mypage");
        modelAndView.addObject("contracts", contractService.getContract());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView addContract(@ModelAttribute (name="contract") @Valid Contract contract, BindingResult result){

        ModelAndView modelAndView = new ModelAndView("mypage");

        if(!result.hasFieldErrors()){
            contractService.save(contract);
        }
        modelAndView.addObject("contracts", contractService.getContract());
        return modelAndView;
    }
}
