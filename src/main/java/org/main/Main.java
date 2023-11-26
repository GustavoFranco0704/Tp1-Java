package org.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import packEscola.Disciplina;
import packEscola.Escola;
import packPessoa.Aluno;
import packPessoa.Professor;


public class Main {
    public static  final Logger Logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        try {
            Escola escola = new Escola();

            Aluno aluno1 = new Aluno("Gustavo", 23, 4521);
            Aluno aluno2 = new Aluno("Andressa", 23, 4691);
            escola.cadastrarAluno(aluno1);
            escola.cadastrarAluno(aluno2);

            Professor professor1 = new Professor("Caitu", 43, 621);
            Professor professor2 = new Professor("Calleri", 31, 511);
            escola.cadastrarProfessor(professor1);
            escola.cadastrarProfessor(professor2);

            Disciplina disciplina1 = new Disciplina("Matemática");
            Disciplina disciplina2 = new Disciplina("História");
            escola.cadastrarDisciplina(disciplina1);
            escola.cadastrarDisciplina(disciplina2);

            escola.lancarNota(aluno1, disciplina1, 8.5);
            escola.lancarNota(aluno2, disciplina1, 7.5);
            escola.lancarNota(aluno1, disciplina2, 9.0);
            escola.lancarNota(aluno2, disciplina2, 8.0);


            Logger.info("Escola, alunos, professores e disciplinas inicializados com sucesso e dados adicionados.");
            Logger.debug("Informações de depuração sobre o estado do programa (se necessário).");
        } catch (Exception e) {

            Logger.error("Ocorreu um erro no método principal", e);
        }


    }
}