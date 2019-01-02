package users.model;

import item.model.Item;

public class ClientAddItemRequest {
  private String clientName;
  private Item item;

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public String getClientName() {

    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }
}
