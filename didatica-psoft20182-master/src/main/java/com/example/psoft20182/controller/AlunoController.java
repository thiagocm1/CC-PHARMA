package com.example.psoft20182.controller;

import java.util.List;
import com.example.psoft20182.model.Aluno;
import com.example.psoft20182.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * AlunoController
 */
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAlunos() {
        return this.alunoService.getAll();
    }
    
    @GetMapping(value="/{id}")
    public Aluno findById(@PathVariable(value = "id") String id) {
        return this.alunoService.findById(id);
    }

    @PostMapping
    public Aluno insertAluno(@RequestBody Aluno aluno) {
        return this.alunoService.insertAluno(aluno);
    }

    @PutMapping(value="/{id}")
    public Aluno updateAluno(@PathVariable String id, @RequestBody Aluno aluno) {
        return this.alunoService.updateAluno(id, aluno);
    }

    @DeleteMapping(value="/{id}")
    public Aluno deleteAluno(@PathVariable String id, @RequestBody Aluno aluno) {
        return this.alunoService.removeAluno(id, aluno);
    }
    
}