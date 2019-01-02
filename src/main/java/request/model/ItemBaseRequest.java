package request.model;

import item.model.Item;

public class ItemBaseRequest {
  private String userName;
  private Item item;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }
}
