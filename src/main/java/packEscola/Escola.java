package packEscola;

import lombok.Data;
import packPessoa.Aluno;
import packPessoa.Professor;


import java.util.ArrayList;
import java.util.List;

import static org.main.Main.Logger;

@Data
public class Escola {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    private List<Nota> nota;

    public Escola() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
        nota = new ArrayList<>();
    }
    public void cadastrarAluno (Aluno aluno){
        alunos.add(aluno);
        Logger.info("Aluno cadastrado: {}", aluno.getNome());
    }
    public void cadastrarProfessor (Professor professor){
        professores.add(professor);
        Logger.info("Professor cadastrado: {}", professor.getNome());
    }
    public void cadastrarDisciplina (Disciplina disciplina){
        disciplinas.add(disciplina);
        Logger.info("Disciplina cadastrada: {}", disciplina.getNomeDisciplina());
    }
    public void lancarNota (Aluno aluno, Disciplina disciplina, double valor){
        Nota notas = new Nota(aluno, disciplina, valor);
        nota.add(notas);
        Logger.info("Nota lançada para o aluno {} na disciplina {}: {}", aluno.getNome(), disciplina.getNomeDisciplina(), valor);
    }
    public List<Nota> getNotas() {

        return nota;
    }
}
