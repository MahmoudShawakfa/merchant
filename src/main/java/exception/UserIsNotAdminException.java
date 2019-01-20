package exception;

public class UserIsNotAdminException extends RuntimeException {
  public UserIsNotAdminException(String message,Exception e) {
    super(message,e);
  }

  public UserIsNotAdminException(String message) {
    super(message);
  }
}
