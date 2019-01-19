package users.model;

import item.model.Item;

import java.util.List;
import java.util.Map;

public class User {
  private String userName;
  private String password;
  private boolean isActive;
  private Map<Integer,Item> items;

  public Map<Integer, Item> getItems() {
    return items;
  }

  public void setItems(Map<Integer, Item> items) {
    this.items = items;
  }

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setIsActive(boolean isActive){this.isActive=isActive;}

  public boolean isActive() {
    return isActive;
  }
}
