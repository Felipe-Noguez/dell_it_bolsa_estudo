package com.itacademy.bolsaestudos.controller;

import java.util.List;

import com.itacademy.bolsaestudos.bean.BolsistaZeroBean;
import com.itacademy.bolsaestudos.bean.MediaAnualBean;
import com.itacademy.bolsaestudos.service.BolsistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//primeira camada de interação entre o backend e a view
@Controller
public class BolsistaController {
    
    @Autowired
    BolsistaService bolsistaService;

    @GetMapping(value = "/listar-bolsista-zero/{ano}")
    public ResponseEntity<BolsistaZeroBean> consultarBolsistaZeroPorAno (@PathVariable("ano") Integer ano) {
        BolsistaZeroBean bolsistaZeroBean = bolsistaService.consultarBolsistaZeroPorAno(ano);
        //if ternario, caso não encontre nenhum bolsista no ano desejado, ira tratar o erro com not found
        return bolsistaZeroBean == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(bolsistaZeroBean);
   }

   @GetMapping(value = "/consultar-media-anual/{ano}")
   public ResponseEntity<MediaAnualBean> consultarMediaAnual (@PathVariable("ano") Integer ano) {
       var mediaAnual = bolsistaService.consultarMediaAnual(ano);
       return ResponseEntity.ok(new MediaAnualBean(mediaAnual));
   }

   /*
   @GetMapping(value = "/consultar-tres-maiores-valores-de-bolsas")
   public ResponseEntity<Bolsista> buscarTresBolsistasComMaioresBolsas(){
       List <Bolsista> maioresBolsas = bolsistaService.buscarTresBolsistasComMaioresBolsas();
       return 
   }
   */         
}
//API Rest
//Postman