package cart.model;

import item.model.Item;

import java.util.List;

public class Cart {

  private List<Item> items;
  private int numberOfItems;

  public void addToCart(Item item) {
    items.add(item);
  }

  public void removeFromCart(Item item) {
    if (items.contains(item)) {
      items.remove(item);
    }
  }

  public double calculateTotalPrice() {
    double totalPrice = 0;
    for (Item item : items) {
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }
}
