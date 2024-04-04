package ac1.aluno.service;

import org.springframework.stereotype.Service;

import ac1.aluno.repository.alunorepository;
import ac1.aluno.model.Aluno;

import java.util.List;

@Service
public class AlunoServiceimpl implements alunoservice {

    private alunorepository alunoRepository;

    public AlunoServiceimpl(alunorepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Aluno criarAluno(Aluno aluno) {
        return alunoRepository.criarAluno(aluno);
    }

    @Override
    public Aluno obterAlunoPorId(Long id) {
        return alunoRepository.obterAlunoPorId(id);
    }

    @Override
    public List<Aluno> obterTodosAlunos() {
        return alunoRepository.obterTodosAlunos();
    }

    @Override
    public Aluno atualizarAluno(Long id, Aluno alunoAtualizado) {
        return alunoRepository.atualizarAluno(id, alunoAtualizado);
    }

    public boolean deletarAluno(int id) {
        alunoRepository.remove(id);
        return true;
    }
}
