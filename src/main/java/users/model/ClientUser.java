package users.model;

import item.model.Category;
import item.model.Item;
import item.model.Report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClientUser extends User {
  private double rating;
  private boolean isActive;
  private Map<Integer,Item> items;

  public ClientUser(String userName, String password) {
    super(userName, password);
  }

  public void addPost(Category categories, boolean isSponsored) {
    Item item = new Item.Builder().setDescription("d").setPrice(2.3).build();
  }

  public Map<Integer,Item> getItems() {
    return items;
  }
}
