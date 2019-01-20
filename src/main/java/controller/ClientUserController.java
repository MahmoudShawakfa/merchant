package controller;

import Utils.Utils;
import item.model.Item;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import request.model.ItemBaseRequest;
import users.model.ClientUser;

import java.util.Map;

@RestController
public class ClientUserController {

  @PostMapping(value = "/addItem", produces = "application/json")
  public void addItemController(@RequestBody ItemBaseRequest itemBaseRequest) {
    ClientUser user = Utils.getUser(itemBaseRequest.getUserName(), ClientUser.class);
    Map<Integer, Item> items = user.getItems();
    items.put(itemBaseRequest.getItem().getId(), itemBaseRequest.getItem());
  }

  @PostMapping(value = "/removeItem", produces = "application/json")
  public void removeItemController(@RequestBody ItemBaseRequest itemBaseRequest) {
    ClientUser user = Utils.getUser(itemBaseRequest.getUserName(), ClientUser.class);
    Map<Integer, Item> items = user.getItems();
    if (items != null && items.containsKey(itemBaseRequest.getItem().getId())) {
      user.getItems().remove(itemBaseRequest.getItem().getId());
    }
  }

  @PostMapping(value = "/sponsorItem", produces = "application/json")
  public void sponsorItem(@RequestBody ItemBaseRequest itemBaseRequest) {
    ClientUser user = Utils.getUser(itemBaseRequest.getUserName(), ClientUser.class);
    Map<Integer, Item> items = user.getItems();
    if (items != null && items.containsKey(itemBaseRequest.getItem().getId())) {
      user.getItems().get(itemBaseRequest.getItem().getId()).setSponsored(true);
    }
  }

  @PostMapping(value = "/reviewItem", produces = "application/json")
  public void reviewItem(@RequestBody ItemBaseRequest itemBaseRequest, int rating) {
    ClientUser user = Utils.getUser(itemBaseRequest.getUserName(), ClientUser.class);
    user.getItems().get(itemBaseRequest.getItem().getId()).getRating();
  }

}
