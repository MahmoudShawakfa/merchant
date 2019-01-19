package request.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import users.model.Admin;

@JsonDeserialize
public class AdminBaseRequest {
  private Admin admin;
  private String userName;

  public Admin getAdmin() {
    return admin;
  }

  public void setAdmin(Admin admin) {
    this.admin = admin;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
