package exception;

public class ItemDoesNotExistException extends RuntimeException {
  public ItemDoesNotExistException(String message,Exception e) {
    super(message, e);
  }
  public ItemDoesNotExistException(String message) {
    super(message);
  }
}
