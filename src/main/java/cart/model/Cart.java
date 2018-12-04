package cart.model;

import item.model.Item;

import java.util.List;

public class Cart {

  private List<Item> cartOfItems;
  private double totalPrice;
  private int numberOfItems;

  public void addToCart(Item item) {
    cartOfItems.add(item);
    totalPrice += item.getTotalPrice();
  }

  public void removeFromCart(Item item) {
    cartOfItems.remove(item);
    totalPrice -= item.getTotalPrice();
  }


}
