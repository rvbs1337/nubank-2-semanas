package domain.enums;

public enum TipoConta {

    POUPANCA("Poupanca"),
    SALARIO("Salario"),
    CORRENTE("Corrente");

    private String nome;

    TipoConta(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
