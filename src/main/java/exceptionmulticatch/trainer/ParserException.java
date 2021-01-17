package exceptionmulticatch.trainer;

public class ParserException extends RuntimeException {
    public ParserException(String message, Throwable cause){
        super(message, cause);
    }
}
