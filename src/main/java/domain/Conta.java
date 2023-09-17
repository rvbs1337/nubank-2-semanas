package domain;

import domain.exceptions.SaldoPoupancaException;
import domain.exceptions.SemVinculoException;

public abstract class Conta {

    private int numeroConta;
    private double saldo;
    private Pessoa pessoa;

    public Conta(int numeroConta, Pessoa pessoa, double saldo){
        this.numeroConta = numeroConta;
        this.pessoa = pessoa;
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }
}
