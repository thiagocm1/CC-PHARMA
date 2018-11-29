package com.example.psoft20182.service;

import java.util.List;

import com.example.psoft20182.model.Aluno;
import com.example.psoft20182.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AlunoService
 */
@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> getAll() {
        return this.alunoRepository.findAll();
    }

    public Aluno findByRg(String rg) {
        return this.alunoRepository.findByRg(rg);
    }

    public Aluno findById(String id) {
        return this.alunoRepository.findById(id).get();
    }

    public Aluno insertAluno(Aluno aluno) {
        return this.alunoRepository.save(aluno);
    }

    public Aluno removeAluno(String id, Aluno aluno) {
        if (id.equals(aluno.getMatricula())) {
            this.alunoRepository.delete(aluno);
            return aluno;
        } else {
            return null;
        }
    }

    public Aluno updateAluno(String id, Aluno aluno) {
        if (id.equals(aluno.getMatricula())) {
            return this.alunoRepository.save(aluno);
        } else {
            return null;
        }
    }

}