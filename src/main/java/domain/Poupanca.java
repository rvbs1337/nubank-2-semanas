package domain;

import domain.exceptions.SaldoPoupancaException;

public class Poupanca extends Conta{

    public Poupanca(int numeroConta, Pessoa pessoa, double saldo) {
        super(numeroConta, pessoa, saldo);

        if (saldo < 50.0) {
            throw new SaldoPoupancaException();
        }
    }

}
