package users.model;

import item.model.Categories;
import item.model.Item;
import item.model.Report;

import java.util.ArrayList;

public class Admin extends User {
  boolean isActive;

  public Admin(String userName, String password) {
    super(userName, password);
    isActive = true;
  }

  public void changeUserStatus(ClientUser user, boolean isActive) {
    user.setIsActive(false);
  }

  public void changePostStatus(Item item,boolean blocked){
    item.setBlocked(blocked);
  }

  public ArrayList<Report> readReports(Item item){
    return item.getReports();
  }

  public Categories createNewCategory(String categoryName){
    return new Categories(categoryName);
  }
}
