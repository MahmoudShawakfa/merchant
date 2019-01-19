package exception;

public class UserIsNotAClientUserException extends RuntimeException {
  public UserIsNotAClientUserException(String message) {
    super(message);
  }
}
