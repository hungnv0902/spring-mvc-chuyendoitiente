package com.codegym.controller;

import com.codegym.persistence.CalculatorPersistenceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConverterController {
    CalculatorPersistenceImpl calculatorPersistence = new CalculatorPersistenceImpl();
    @GetMapping("/form")

    public String form( Model model) {
        return "form";
    }

    @GetMapping("converter")
    public String calculator(@RequestParam("usd") float usd, Model model) {
        float result = calculatorPersistence.converter(usd);
        model.addAttribute("result",result);
        model.addAttribute("usd",usd);
        return "converter";
    }

}
