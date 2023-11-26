package packEscola;

import lombok.Data;

@Data
public class Disciplina {
    private String nomeDisciplina;


    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {

        return nomeDisciplina;
    }
}

