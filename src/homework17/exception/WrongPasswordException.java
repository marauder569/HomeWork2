package homework17.exception;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

}