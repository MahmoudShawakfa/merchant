package item.model;

import java.util.List;

public class Item {
  private String picture;
  private boolean sponsored;
  private boolean blocked;
  private double rating;
  private double price;
  private String description;

  public String getDescription() {
    return description;
  }

  private List<Report> reports;

  public String getPicture() {
    return picture;
  }

  public boolean isSponsored() {
    return sponsored;
  }

  public boolean isBlocked() {
    return blocked;
  }

  public double getRating() {
    return rating;
  }

  public double getPrice() {
    return price;
  }

  public List<Report> getReports() {
    return reports;
  }

  //TODO: change to image type
  public static class Builder{
    private String picture;
    private String description;
    private boolean sponsored;
    private boolean blocked;
    private double rating;
    private double price;
    private List<Report> reports;

    public Builder isBlocked(boolean blocked) {
      this.blocked = blocked;
      return this;
    }
    public Builder isSponsored(boolean sponsored) {
      this.sponsored = sponsored;
      return this;
    }
    public Builder setPicture(String picture) {
      this.picture = picture;
      return this;
    }

    public Builder setRating(double rating) {
      this.rating = rating;
      return this;
    }

    public Builder setPrice(double price) {
      this.price = price;
      return this;
    }

    public Builder setDescription(String description){
      this.description = description;
      return this;
    }

    public Item build(){
      Item item = new Item();
      item.picture = this.picture;
      item.blocked = this.blocked;
      item.rating = this.rating;
      item.price = this.price;
      item.reports = this.reports;
      item.sponsored = this.sponsored;
      item.description =  this.description;
      return item;
    }
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return ("Item: desc :" + this.getDescription()+ "price :" + this.getPrice());
  }

  @Override
  public boolean equals(Object obj) {
    Item item = (Item) obj;
    return this.getDescription().equals(item.getDescription());
  }
}
