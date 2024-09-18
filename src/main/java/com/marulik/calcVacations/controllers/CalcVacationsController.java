package com.marulik.calcVacations.controllers;

import com.marulik.calcVacations.models.Calculator;
import com.marulik.calcVacations.service.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CalcVacationsController {
    Calculator calculator = new Calculator();

    @Autowired
    private Calculate calculate;

    @RequestMapping("/")
    public String input(Model model) {
        model.addAttribute("calculator", calculator);
        return "input";
    }

    @RequestMapping(value = "/", params = "result", method = RequestMethod.POST)
    public String result(@ModelAttribute("calculator") Calculator calculator, Model model) {
        model.addAttribute("result", calculate.result(calculator));
      return "input";
    }

}