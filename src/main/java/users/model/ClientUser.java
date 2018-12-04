package users.model;

import item.model.Categories;
import item.model.Item;
import item.model.Report;

import java.util.ArrayList;

public class ClientUser extends User {
  private double rating;
  private boolean isActive;

  public ClientUser(String userName, String password) {
    super(userName, password);
  }

  public void addPost(Categories categories, boolean isSponsored) {
    Item.builder().isBlocked(false).isSponsored(isSponsored).rating(0).reports(new ArrayList<Report>()).build();
  }
}
