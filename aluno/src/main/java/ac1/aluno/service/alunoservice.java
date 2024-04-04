package ac1.aluno.service;

import ac1.aluno.model.Aluno;

import java.util.List;

public interface alunoservice {
    Aluno criarAluno(Aluno aluno);

    Aluno obterAlunoPorId(Long id);

    Aluno atualizarAluno(Long id, Aluno aluno);

    boolean deletarAluno(int id);

    List<Aluno> obterTodosAlunos();
}
