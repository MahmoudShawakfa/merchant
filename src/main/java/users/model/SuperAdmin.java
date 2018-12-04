package users.model;

import org.apache.http.client.fluent.Request;

public class SuperAdmin extends User {

  public SuperAdmin(String userName, String password) {
    super(userName, password);
  }

  @Override
  public void setIsActive(boolean isActive) {
    super.setIsActive(true);
  }

  public Admin createAdmin(String userName, String password){
    return new Admin(userName,password);
  }

  public void setAdminStatus(Admin admin,boolean isActive){
    admin.setIsActive(isActive);
  }


}
