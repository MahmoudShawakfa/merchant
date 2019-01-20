package exception;

public class UserDoesNotExistException extends RuntimeException {
  public UserDoesNotExistException(String message, Exception e) {
    super(message, e);
  }

  public UserDoesNotExistException(String message) {
    super(message);
  }
}
