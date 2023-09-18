package domain;

import java.util.List;

public abstract class Conta {

    private int numeroConta;
    private double saldo;
    private Pessoa pessoa;
    private List<String> extrato;

    public Conta(int numeroConta, Pessoa pessoa, double saldo){
        this.numeroConta = numeroConta;
        this.pessoa = pessoa;
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double saldo) {
        this.saldo += saldo;
        extrato.add("+" + saldo);
    }

    public void removeSaldo(double saldo){
        this.saldo -= saldo;
        extrato.add("-" + saldo);
    }

    public List<String> getExtrato() {
        return extrato;
    }
}
