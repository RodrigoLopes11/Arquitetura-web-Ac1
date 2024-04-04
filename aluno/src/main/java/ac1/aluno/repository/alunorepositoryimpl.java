package ac1.aluno.repository;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import ac1.aluno.model.Aluno;

@Repository
public class alunorepositoryimpl implements alunorepository {

    private List<Aluno> alunos = new ArrayList<>();
    private Long proximoId = 1L;

    @Override
    public Aluno criarAluno(Aluno aluno) {
        aluno.setId(proximoId++);
        alunos.add(aluno);
        return aluno;
    }

    @Override
    public Aluno obterAlunoPorId(Long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public List<Aluno> obterTodosAlunos() {
        alunos.add(new Aluno(1L, "Rodrigo", "123", "ADS", "rodrigo@gmail.com", "(13)1234-5678"));
        alunos.add(new Aluno(1L, "Antonio", "456", "Medicina", "antonio@gmail.com", "(12)3546-7890"));
        alunos.add(new Aluno(1L, "João", "789", "Engenharia Química", "joao@gmail.com", "(15)98824-8690"));
        return alunos;
    }

    @Override
    public Aluno atualizarAluno(Long id, Aluno alunoAtualizado) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                aluno.setNome(alunoAtualizado.getNome());
                aluno.setMatricula(alunoAtualizado.getMatricula());
                aluno.setCurso(alunoAtualizado.getCurso());
                aluno.setEmail(alunoAtualizado.getEmail());
                aluno.setTelefone(alunoAtualizado.getTelefone());
                return aluno;
            }
        }
        return null;
    }

    public boolean deletarAluno(int id) {
        alunos.remove(id);
        return true;
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
