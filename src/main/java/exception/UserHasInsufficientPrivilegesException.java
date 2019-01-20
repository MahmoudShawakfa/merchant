package exception;

public class UserHasInsufficientPrivilegesException extends RuntimeException {
  public UserHasInsufficientPrivilegesException(String message, ClassCastException e) {
  super(message, e);
  }

}
