package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlunoController {

    @GetMapping("/")
    public String abrirFormulario(Model model) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno(1, "Israel", "M"));
        alunos.add(new Aluno(2, "Maria", "F"));
        alunos.add(new Aluno(3, "João", "M"));
        alunos.add(new Aluno(4, "Pedro", "M "));

        model.addAttribute("listaAlunos", alunos);
        return "cadastro";

    }
}
