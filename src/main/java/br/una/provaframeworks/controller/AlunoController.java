package br.una.provaframeworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlunoController {
    @GetMapping("/")
    public String list(Model model){
        return "aluno/listar";
    }

    @GetMapping("/editar")
    public String edit(Model model, @RequestParam Long alunoId){
        return "aluno/formulario";
    }

    @GetMapping("/novo")
    public String novo(Model model){
        return "aluno/formulario";
    }

}
