package exception;

public class UserAlreadyExistsException extends RuntimeException {
  public UserAlreadyExistsException(String message,Exception e) {
    super(message, e);
  }

  public UserAlreadyExistsException(String message) {
    super(message);
  }
}
