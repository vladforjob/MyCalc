package myexception;

public class IncorrectInputStringException extends RuntimeException {
    public IncorrectInputStringException(String errorMessage) {
        super(errorMessage);
    }
}
