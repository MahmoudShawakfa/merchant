package item.model;

import lombok.Builder;

import java.util.ArrayList;

@Builder
public class Item {
  //TODO: change to image type
  String picture;
  boolean isSponsored;
  boolean isBlocked;
  double rating;
  double price;
  ArrayList<Report> reports;

  public String getPicture() {
    return picture;
  }

  public boolean isSponsored() {
    return isSponsored;
  }

  public boolean isBlocked() {
    return isBlocked;
  }

  public double getRating() {
    return rating;
  }

  public double getPrice() {
    return price;
  }

  public ArrayList<Report> getReports() {
    return reports;
  }

  public void setBlocked(boolean blocked) {
    this.isBlocked = blocked;
  }
}
