package com.itacademy.bolsaestudos.service;

import java.util.List;

import com.itacademy.bolsaestudos.bean.BolsistaZeroBean;
import com.itacademy.bolsaestudos.model.Bolsista;
import com.itacademy.bolsaestudos.repository.BolsistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Aqui encontra-se a logica
@Service
public class BolsistaService {

    @Autowired
    BolsistaRepository bolsistaRepository;
    
    
    public BolsistaZeroBean consultarBolsistaZeroPorAno (Integer anoReferencia){
        Bolsista bolsista = bolsistaRepository.findFirstByAnoReferenciaOrderByIdDesc(anoReferencia);
        return bolsista == null
            ? null 
            : new BolsistaZeroBean(bolsista.getName(), bolsista.getCpf(), bolsista.getEntidadeEnsino(), bolsista.getValorBolsistaPagamento());//populei o objeto com os dados que veio da entidade
    }

    public Double consultarMediaAnual (Integer anoReferencia){
        var bolsistas = bolsistaRepository.findAllByAnoReferencia(anoReferencia);
        return bolsistas.stream().mapToDouble(Bolsista::getValorBolsistaPagamento).average().orElse(0.0);
    }

    public List<Bolsista> buscarTresBolsistasComMaioresBolsas(){
        return bolsistaRepository.findTop3MaxValorBolsistaPagamento();
    }
    public List<Bolsista> buscarTresBolsistasComMenoresBolsas(){
        return bolsistaRepository.findTop3MinValorBolsistaPagamento();
    }
}
