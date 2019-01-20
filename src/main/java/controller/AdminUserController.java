package controller;

import Utils.Utils;
import exception.*;
import item.model.Item;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import request.model.AdminBaseRequest;
import request.model.AdminItemRequest;
import users.model.Admin;
import users.model.ClientUser;


@RestController
public class AdminUserController {

  @PostMapping(produces = "application/json", value = "/blockUser")
  public void blockUser(@RequestBody AdminBaseRequest adminBaseRequest) {
    Utils.getUser(adminBaseRequest.getAdmin().getUserName(), Admin.class).changeUserStatus(
            Utils.getUser(adminBaseRequest.getAdmin().getUserName(), ClientUser.class), true);
  }

  @PostMapping(produces = "application/json", value = "/unblockUser")
  public void unblockUser(@RequestBody AdminBaseRequest adminBaseRequest) {
    Utils.getUser(adminBaseRequest.getAdmin().getUserName(), Admin.class).changeUserStatus(
            Utils.getUser(adminBaseRequest.getAdmin().getUserName(), ClientUser.class), false);
  }

  @PostMapping(produces = "application/json", value = "/blockItem")
  public void blockItem(@RequestBody AdminItemRequest adminItemRequest) {
    changeItemBlockStatus(adminItemRequest, true);
  }

  @PostMapping(produces = "application/json", value = "/unblockItem")
  public void unblockItem(@RequestBody AdminItemRequest adminItemRequest) {
    changeItemBlockStatus(adminItemRequest, false);
  }

  private void changeItemBlockStatus(@RequestBody AdminItemRequest adminItemRequest, boolean b) {
    ClientUser clientUser = Utils.getUser(adminItemRequest.getAdmin().getUserName(), ClientUser.class);
    Item item = clientUser.getItems().get(adminItemRequest.getId());
    if (item != null) {
      Utils.getUser(adminItemRequest.getAdmin().getUserName(), Admin.class).changePostStatus(item, b);
      return;
    }
    throw new ItemDoesNotExistException("The Item Does Not Exist");
  }
}
