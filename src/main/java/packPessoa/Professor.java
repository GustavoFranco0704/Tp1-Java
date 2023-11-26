package packPessoa;

import lombok.Data;

@Data
public class Professor extends Pessoa {
    private int registro;

    public Professor(String nome, int idade, int registro) {
        super(nome, idade);
        this.registro= registro;
    }


}
