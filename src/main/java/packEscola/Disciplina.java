package packEscola;

import lombok.Data;

@Data
public class Disciplina {
    private String nome;
    private double codigo;

    public Disciplina(String nome, double codigo) {
    }

    public String getNome() {
        return nome;
    }
}
