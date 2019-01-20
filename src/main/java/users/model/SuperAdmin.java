package users.model;

public class SuperAdmin extends User {

  public SuperAdmin(String userName, String password) {
    super(userName, password);
  }

  @Override
  public void setActive(boolean isActive) {
    super.setActive(true);
  }

  public Admin createAdmin(String userName, String password){
    return new Admin(userName,password);
  }

  public void setAdminStatus(Admin admin,boolean isActive){
    admin.setActive(isActive);
  }


}
