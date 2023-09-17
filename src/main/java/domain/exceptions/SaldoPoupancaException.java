package domain.exceptions;

public class SaldoPoupancaException extends RuntimeException{

public SaldoPoupancaException(){
    super("O saldo deve ser maior que R$ 50,00.");
}

}
