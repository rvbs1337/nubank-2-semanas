package domain;

import domain.enums.TipoConta;

public class Conta {

    private int numeroConta;
    private double saldo;
    private Pessoa pessoa;
    private Pessoa pessoa2;
    private TipoConta tipoConta;

    public Conta(int numeroConta, double saldo, Pessoa pessoa, TipoConta tipoConta){
        this.numeroConta = numeroConta;
        this.pessoa = pessoa;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public Conta(int numeroConta, double saldo, Pessoa pessoa, Pessoa pessoa2, TipoConta tipoConta){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.pessoa = pessoa;
        this.pessoa2 = pessoa2;
        this.tipoConta = tipoConta;

        if(tipoConta == TipoConta.POUPANCA){
            this.saldo > 50;
        }

    }

}
