package org.example.web;
import lombok.RequiredArgsConstructor;
import org.example.domain.Contract;
import org.example.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@RequestMapping("/mypage")
public class MyController {

private final ContractService contractService;

    @GetMapping
    public String page(){
        return "mypage";
    }

    @PostMapping
    public ModelAndView addContract(@Valid Contract contract, BindingResult result){

        ModelAndView modelAndView = new ModelAndView("mypage");

        if (result.hasFieldErrors()){
            result.getFieldErrors()
                    .forEach(fieldError -> {
                        String field = fieldError.getField();
                        String defaultMessage = fieldError.getDefaultMessage();

                        modelAndView.addObject(field + "Error", defaultMessage);
                    });
        }

        if(!result.hasFieldErrors()){
            contractService.save(contract);
        }
        modelAndView.addObject("contracts", contractService.getContract());
        return modelAndView;
    }
}
