package ac1.aluno.repository;

import ac1.aluno.model.Aluno;

import java.util.List;

public interface alunorepository {
    Aluno criarAluno(Aluno aluno);

    Aluno obterAlunoPorId(Long id);

    Aluno atualizarAluno(Long id, Aluno aluno);

    boolean deletarAluno(int id);

    List<Aluno> obterTodosAlunos();

    void remove(int id);
}
