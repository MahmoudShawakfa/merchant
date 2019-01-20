package users.model;

import exception.UserAlreadyExistsException;

import java.util.HashMap;
import java.util.Map;

public class UsersMap {
  private static UsersMap usersMap = null;
  private Map<String, User> users;

  private UsersMap() {
    users = new HashMap<String, User>();
    users.put("superAdmin", new SuperAdmin("superAdmin", "P@ssw0rd"));
  }

  public static UsersMap getUsersInstance() {
    if (usersMap == null) {
      usersMap = new UsersMap();
    }
    return usersMap;
  }

  public void addToUserList(String userName, User user) {
    if(usersMap.getUser(userName) == null) {
      users.put(userName, user);
    }
    else {
      throw new UserAlreadyExistsException(String.format("This User: %s Already Exists",userName));
    }
  }

  public void removeFromUserList(User user, String userName) {
    if (users.containsKey(userName)) {
      users.remove(userName);
    }
  }

  public Map<String,User> getUsers() {
    return this.users;
  }

  public User getUser(String userName) {
      return users.get(userName);
  }

}
