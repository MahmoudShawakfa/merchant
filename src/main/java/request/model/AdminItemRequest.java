package request.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class AdminItemRequest extends AdminBaseRequest{
  private int id;

  public int getId() {
    return id;
  }
}
