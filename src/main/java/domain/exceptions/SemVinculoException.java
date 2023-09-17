package domain.exceptions;

public class SemVinculoException extends RuntimeException{
    public SemVinculoException(){
        super("Falha na criacao da conta. Pessoas sem vinculo social.");
    }
}
