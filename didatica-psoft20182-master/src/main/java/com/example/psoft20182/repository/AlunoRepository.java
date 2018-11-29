package com.example.psoft20182.repository;

import com.example.psoft20182.model.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AlunoRepository
 */
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String> {

    public Aluno findByRg(String rg); // Faz a busca por um aluno que tenha o atributo Rg igual ao do parâmetro (O SpringBoot faz isso)

}