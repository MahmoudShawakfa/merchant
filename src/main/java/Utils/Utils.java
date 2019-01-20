package Utils;

import exception.UserDoesNotExistException;
import exception.UserHasInsufficientPrivilegesException;
import users.model.User;
import users.model.UsersMap;

public class Utils {
  public static <T extends User> T getUser(String userName, Class<T> clazz) {
    User user = UsersMap.getUsersInstance().getUser(userName);
    if (user == null) {
      throw new UserDoesNotExistException(
              String.format("This User: %s  Does Not Exist", userName));
    }
    try {
      return clazz.cast(user);
    } catch (ClassCastException e) {
      throw new UserHasInsufficientPrivilegesException(String.format("The User: %s Does Not Have enough privileges",
              userName),
              e);
    }
  }
}
