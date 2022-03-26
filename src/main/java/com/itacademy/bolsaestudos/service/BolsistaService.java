package com.itacademy.bolsaestudos.service;

import com.itacademy.bolsaestudos.model.Bolsista;
import com.itacademy.bolsaestudos.repository.BolsistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class BolsistaService {

    @Autowired
    BolsistaRepository bolsistaRepository;
    
    @GetMapping(value = "/listar-bolsista-zero")
    public Bolsista consultarBolsistaZeroPorAno (@RequestParam int anoReferencia){
        return bolsistaRepository.findFirstByAnoReferenciaOrderByIdDesc(anoReferencia);
    }
}
