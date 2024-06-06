package custom.exception.starter.exception;

public class IllegalCurrencyTypeException extends RuntimeException {
    public IllegalCurrencyTypeException(String message){
        super(message);
    }
}
