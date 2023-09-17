package domain.enums;

public enum EstadoCivil {

    SOLTEIRO("Solteiro"),
    UNIAO_ESTAVEL("União Estavel"),
    CASADO("Casado");

    private String nome;

    EstadoCivil(String nome){
        this.nome = nome;
    }
}
