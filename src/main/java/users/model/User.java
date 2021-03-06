package users.model;

public class User {
  private String userName;
  private String password;
  private boolean isActive;

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
