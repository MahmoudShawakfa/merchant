package exception;

public class UserDoesNotExistException extends RuntimeException {
  public UserDoesNotExistException(String message) {
    super("The Following user: "+ message + "does not exist");
  }
}
