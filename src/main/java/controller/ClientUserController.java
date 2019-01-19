package controller;

import exception.UserDoesNotExistException;
import item.model.Item;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import request.model.ItemBaseRequest;
import users.model.ClientUser;
import users.model.User;
import users.model.UsersMap;

import java.util.List;
import java.util.Map;

@RestController
public class ClientUserController {

  UsersMap usersMap = UsersMap.getUsersInstance();

  @PostMapping(value = "/addItem", produces = "application/json")
  public void addItemController(@RequestBody ItemBaseRequest itemBaseRequest) {
    User user = getAndValidateUser(itemBaseRequest);
    ClientUser user1 = (ClientUser) user;
    Map<Integer, Item> items = user1.getItems();
    items.put(itemBaseRequest.getItem().getId(),itemBaseRequest.getItem());
  }

  @PostMapping(value = "/removeItem", produces = "application/json")
  public void removeItemController(@RequestBody ItemBaseRequest itemBaseRequest) {
    User user = getAndValidateUser(itemBaseRequest);
    Map<Integer, Item> items = user.getItems();
    if (items != null && items.containsKey(itemBaseRequest.getItem().getId())) {
      user.getItems().remove(itemBaseRequest.getItem().getId());
    }
  }

  @PostMapping(value = "/sponsorItem", produces = "application/json")
  public void sponsorItem(@RequestBody ItemBaseRequest itemBaseRequest) {
    User user = getAndValidateUser(itemBaseRequest);
    Map<Integer, Item> items = user.getItems();
    if (items != null && items.containsKey(itemBaseRequest.getItem().getId())) {
      user.getItems().get(itemBaseRequest.getItem().getId()).setIsSponsored(true);
    }
  }

  private User getAndValidateUser(ItemBaseRequest itemBaseRequest) {
    User user = usersMap.getUser(itemBaseRequest.getUserName());
    if (user == null) {
      throw new UserDoesNotExistException(itemBaseRequest.getUserName());
    }
    return user;
  }
}
