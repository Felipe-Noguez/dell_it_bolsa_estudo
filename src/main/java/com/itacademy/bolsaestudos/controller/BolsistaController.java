package com.itacademy.bolsaestudos.controller;

import com.itacademy.bolsaestudos.service.BolsistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//primeira camada de interação entre o backend e a view
@Controller
public class BolsistaController {
    
    @Autowired
    BolsistaService bolsistaService;

    public String consultarBolsistaZeroPorAno (int ano) {
        var bolsista = bolsistaService.consultarBolsistaZeroPorAno(ano);
        return bolsista.getName();
    }

}
