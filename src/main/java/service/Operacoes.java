package service;

import domain.Conta;

import java.util.List;

public class Operacoes {

    public void depositar(Conta conta, double valorDeposito){
        conta.addSaldo(valorDeposito);
    }

    public boolean sacar(Conta conta, double valorSaque){
        if(conta.getSaldo() >= valorSaque){
            conta.removeSaldo(valorSaque);
            return true;
        }
        return false;
    }

    public boolean transferir(Conta contaTransfere, Conta contaRecebe, double valorTransferencia){
        if(sacar(contaTransfere, valorTransferencia)){
            depositar(contaRecebe, valorTransferencia);
            return true;
        }
        return false;
    }

    public String calcularFinanciamento(Double valorFinanciamento, int meses){
        Double parcela = 0.0;

        if(meses < 48 && meses > 32){
            parcela = (valorFinanciamento / meses)*1.05;

            return meses + " Parcelas: R$ " + parcela + " Valor total: R$ " + (parcela * meses);
        }else if(meses > 24){
            parcela = (valorFinanciamento / meses)*1.04;

            return meses + " Parcelas: R$ " + parcela + " Valor total: R$ " + (parcela * meses);
        } else if(meses > 12) {
            parcela = (valorFinanciamento / meses)*1.03;

            return meses + " Parcelas: R$ " + parcela + " Valor total: R$ " + (parcela * meses);
        } else {
            return "Quantidade de meses indisponiveis para financiamento.";
        }
    }

    public double aplicar(Conta conta, double valorAplicacao, int meses){
        if(sacar(conta, valorAplicacao)){
            for(int i = 0; i < meses; i++) {
                valorAplicacao += valorAplicacao*0.003;
            }
            depositar(conta, valorAplicacao);
            return valorAplicacao;
        }
        return 0.0;
    }

    public List<String> extrato(Conta conta){
        return conta.getExtrato();
    }
}
