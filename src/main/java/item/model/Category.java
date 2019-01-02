package item.model;

import java.util.List;

public class Category {
  private String categoryName;
  private List<Field> topFields;
  private List<Field> otherFields;

  public Category(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public List<Field> getTopFields() {
    return topFields;
  }

  public void setTopFields(List<Field> topFields) {
    this.topFields = topFields;
  }

  public List<Field> getOtherFields() {
    return otherFields;
  }

  public void setOtherFields(List<Field> otherFields) {
    this.otherFields = otherFields;
  }
}
