package item.model;

import java.util.ArrayList;

public class Categories {
  private String categoryName;
  ArrayList<Field> topFields;
  ArrayList<Field> otherFields;

  public Categories(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public ArrayList<Field> getTopFields() {
    return topFields;
  }

  public void setTopFields(ArrayList<Field> topFields) {
    this.topFields = topFields;
  }

  public ArrayList<Field> getOtherFields() {
    return otherFields;
  }

  public void setOtherFields(ArrayList<Field> otherFields) {
    this.otherFields = otherFields;
  }
}
