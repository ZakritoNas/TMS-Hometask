package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.domain.Contract;
import org.example.service.ContractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequiredArgsConstructor
@Controller
@RequestMapping("/mypage")
public class MyController {

private final ContractService contractService;

    @RequestMapping(method = RequestMethod.GET)
    public String page(){
        return "mypage";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addContract(Contract contract){
        contractService.save(contract);
        return "mypage";
    }

}
