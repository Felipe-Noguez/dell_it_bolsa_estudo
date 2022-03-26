package com.itacademy.bolsaestudos.repository;

import com.itacademy.bolsaestudos.model.Bolsista;

import org.springframework.data.jpa.repository.JpaRepository;

//classe de acesso ao banco
public interface BolsistaRepository extends JpaRepository <Bolsista, Integer>{
    Bolsista findFirstByAnoReferenciaOrderByIdDesc(int anoReferencia);
}
