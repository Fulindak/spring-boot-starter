package custom.exception.starter.exception;

public class CurrencyFileWriteException extends RuntimeException {
    public CurrencyFileWriteException(String message) {
        super(message);
    }
}
