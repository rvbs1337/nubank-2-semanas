package domain;

import domain.enums.EstadoCivil;

public class Pessoa {

    private String nome;
    private String cpf;
    private EstadoCivil estadoCivil;

    public Pessoa(String nome, String cpf, EstadoCivil estadoCivil){
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }


}
