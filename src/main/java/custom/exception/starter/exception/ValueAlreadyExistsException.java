package custom.exception.starter.exception;

public class ValueAlreadyExistsException extends RuntimeException {
    public ValueAlreadyExistsException(String message) {
        super(message);
    }
}
