package packEscola;

import lombok.Data;
import packPessoa.Aluno;

@Data
public class Nota {
    private Aluno aluno;
    private Disciplina disciplina;
    private double valor;


    public Nota(Aluno aluno, Disciplina disciplina, double valor) {
    }
    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public double getValor() {
        return valor;
    }
}
