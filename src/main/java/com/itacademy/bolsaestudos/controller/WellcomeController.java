package com.itacademy.bolsaestudos.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ComponentScan(basePackages={"com.itacademy.bolsaestudos.controller"})
public class WellcomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model) {
        model.put("name", "TEST");
        return "welcome";
    }
}
