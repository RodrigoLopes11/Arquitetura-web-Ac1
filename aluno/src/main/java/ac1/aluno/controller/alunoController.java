package ac1.aluno.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/alunos")
public class alunoController {
    private List<Aluno> alunos = new ArrayList<>();
    private Long proximoId = 1L;

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        aluno.setId(proximoId++);
        alunos.add(aluno);
        return aluno;
    }

      @GetMapping
    public List<Aluno> obterAlunos() {
        alunos.add(new Aluno(1L, "Rodrigo", "123", "ADS", "rodrigo@gmail.com", "(15)98824-8690"));
        alunos.add(new Aluno(2L, "Guilherme", "456", "Veterinaria", "guilherme@gmail.com", "(15)95688-4568"));
        alunos.add(new Aluno(3L, "Marcus", "789", "Biomedicina", "marcus@gmail.com", "(15)96658-3695"));
        return alunos;
    }
    @GetMapping("/{id}")
    public Aluno obterAluno(@PathVariable Long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }
}
