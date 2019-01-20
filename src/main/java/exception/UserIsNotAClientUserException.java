package exception;

public class UserIsNotAClientUserException extends RuntimeException {
  public UserIsNotAClientUserException(String message, Exception e) {
    super(message, e);
  }
  public UserIsNotAClientUserException(String message) {
    super(message);
  }
}
