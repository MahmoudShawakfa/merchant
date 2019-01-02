package controller;

import item.model.Item;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import request.model.ItemBaseRequest;
import users.model.ClientUser;
import users.model.User;
import users.model.UsersMap;

import java.util.List;

public class ClientUserController {

  UsersMap usersMap = UsersMap.getUsersInstance();

  @PostMapping(value = "/addItem", produces = "application/json")
  public void addItemController(@RequestBody ItemBaseRequest itemBaseRequest) {
    User user = usersMap.getUser(itemBaseRequest.getUserName());
    ClientUser user1 = (ClientUser) user;
    List<Item> items = user1.getItems();
    items.add(itemBaseRequest.getItem());
  }

  @PostMapping(value = "/removeItem", produces = "application/json")
  public void removeItemController(@RequestBody ItemBaseRequest itemBaseRequest) {

  }

}
