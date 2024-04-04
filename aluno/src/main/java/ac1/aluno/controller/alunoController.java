package ac1.aluno.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ac1.aluno.model.Aluno;
import ac1.aluno.service.alunoservice;

@RestController
@RequestMapping("/api/aluno")
public class alunoController {
    private final alunoservice alunoservice;

    public alunoController(alunoservice alunoservice) {
        this.alunoservice = alunoservice;
    }

    @GetMapping
    public List<Aluno> obterTodosAlunos() {
        return alunoservice.obterTodosAlunos();
    }

    @GetMapping("/{id}")
    public Aluno obterAluno(@PathVariable Long id) {
        return alunoservice.obterAlunoPorId(id);
    }

    @PostMapping("/add")
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return alunoservice.criarAluno(aluno);
    }
}
