package com.itacademy.bolsaestudos.repository;

import java.util.List;

import com.itacademy.bolsaestudos.model.Bolsista;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//classe de acesso ao banco
public interface BolsistaRepository extends JpaRepository <Bolsista, Integer>{
    Bolsista findFirstByAnoReferenciaOrderByIdDesc(Integer anoReferencia); //A ordenação correta seria de forma crescente (asc), porem notei que a planilha .csv está com os dadosna ordem invertida, sendo assim, se fosse utilizado o formato asc,
    List<Bolsista> findAllByAnoReferencia(Integer anoReferencia);          //iria exibir a última pessoa que recebeu a bolsa naquele ano. A solução temporário que encontrei foi utilizar o ordenação descrescente (desc).
                                                                           
    @Query("SELECT MAX(valorBolsistaPagamento) AS valorBolsistaPagamento FROM Bolsista")
    List<Bolsista> findTop3MaxValorBolsistaPagamento();

    @Query("SELECT MIN(valorBolsistaPagamento) AS valorBolsistaPagamento FROM Bolsista")
    List<Bolsista> findTop3MinValorBolsistaPagamento();
}
