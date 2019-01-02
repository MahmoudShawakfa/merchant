package users.model;

import item.model.Category;
import item.model.Item;
import item.model.Report;

import java.util.ArrayList;
import java.util.List;

public class ClientUser extends User {
  private double rating;
  private boolean isActive;
  private List<Item> items;

  public ClientUser(String userName, String password) {
    super(userName, password);
  }

  public void addPost(Category categories, boolean isSponsored) {
    Item item = new Item.Builder().setDescription("d").setPrice(2.3).build();
  }

  public List<Item> getItems() {
    return items;
  }
}
