package packEscola;

import lombok.Data;
import packPessoa.Aluno;
import packPessoa.Professor;


import java.util.ArrayList;
import java.util.List;

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
    }
    public void cadastrarProfessor (Professor professor){
        professores.add(professor);
    }
    public void cadastrarDisciplina (Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void lancarNota (Aluno aluno, Disciplina disciplina, double valor){
        Nota notas = new Nota(aluno, disciplina, valor);
        nota.add(notas);
    }
    public List<Nota> getNotas() {

        return nota;
    }
}
