package service;

import domain.Conjunta;
import domain.Corrente;
import domain.Pessoa;
import domain.Poupanca;
import domain.enums.EstadoCivil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacoesTest {

    @Test
    public void financiamento18MesesTest(){

        Assertions.assertEquals("18 Parcelas: R$ 1144.44 Valor total: R$ 20599.92",  new Operacoes().calcularFinanciamento(20000.0, 18));

    }

    @Test
    public void financiamento26MesesTest(){

        Assertions.assertEquals("26 Parcelas: R$ 800.0 Valor total: R$ 20800.0", new Operacoes().calcularFinanciamento(20000.0, 26));

    }

    @Test
    public void financiamento34MesesTest(){

        Assertions.assertEquals("34 Parcelas: R$ 617.64 Valor total: R$ 20999.76", new Operacoes().calcularFinanciamento(20000.0, 34));

    }

    @Test
    public void financiamentoFalhaTest(){

        Assertions.assertEquals("Quantidade de meses indisponiveis para financiamento.", new Operacoes().calcularFinanciamento(20000.0, 10));

    }

    @Test
    public void aplicar3Meses(){

        Corrente conta = new Corrente(1, new Pessoa("Rubens", "12332109090", EstadoCivil.SOLTEIRO),200.0);

        Assertions.assertEquals(109.0 , new Operacoes().aplicar(conta,100.0,3));

    }

    @Test
    public void transferir200(){

        Poupanca conta1 = new Poupanca(1, new Pessoa("Rubens","12312312312",EstadoCivil.CASADO),50.0);
        Conjunta conta2 = new Conjunta(2, 200.0, new Pessoa("Maik", "32132132132", EstadoCivil.UNIAO_ESTAVEL), new Pessoa("Joana", "13113113113", EstadoCivil.UNIAO_ESTAVEL));

        Assertions.assertEquals(true, new Operacoes().transferir(conta2, conta1, 200.0));

    }

    @Test
    public void transferir200Falha(){

        Poupanca conta1 = new Poupanca(1, new Pessoa("Rubens","12312312312",EstadoCivil.CASADO),50.0);
        Conjunta conta2 = new Conjunta(2, 200.0, new Pessoa("Maik", "32132132132", EstadoCivil.UNIAO_ESTAVEL), new Pessoa("Joana", "13113113113", EstadoCivil.UNIAO_ESTAVEL));

        Assertions.assertEquals(false, new Operacoes().transferir(conta1, conta2, 200.0));

    }

}
