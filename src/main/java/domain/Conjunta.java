package domain;

import domain.enums.EstadoCivil;
import domain.exceptions.SemVinculoException;

public class Conjunta extends Conta{

    private Pessoa pessoa2;

    public Conjunta(int numeroConta, double saldo, Pessoa pessoa, Pessoa pessoa2) throws SemVinculoException{
        super(numeroConta, pessoa ,saldo);

        if((pessoa.getEstadoCivil() == pessoa2.getEstadoCivil()) && (pessoa.getEstadoCivil() != EstadoCivil.SOLTEIRO)){
            this.pessoa2 = pessoa;
        }else{
            throw new SemVinculoException();
        }
    }
}
