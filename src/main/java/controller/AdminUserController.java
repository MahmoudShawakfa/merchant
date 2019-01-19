package controller;

import exception.UserDoesNotExistException;
import exception.UserIsNotAClientUserException;
import exception.UserIsNotAdminException;
import item.model.Item;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import request.model.AdminBaseRequest;
import request.model.AdminItemRequest;
import users.model.Admin;
import users.model.ClientUser;
import users.model.User;
import users.model.UsersMap;


@RestController
public class AdminUserController {

  @PostMapping(produces = "application/json", value = "/blockUser")
  public void blockUser(@RequestBody AdminBaseRequest adminBaseRequest) {
    Admin admin = getAndValidateAdminUser(adminBaseRequest);
    admin.changeUserStatus(getClientUserAndValidateIt(adminBaseRequest),true);
  }

  @PostMapping(produces = "application/json", value = "/unblockUser")
  public void unblockUser(@RequestBody AdminBaseRequest adminBaseRequest) {
    Admin admin = getAndValidateAdminUser(adminBaseRequest);
    admin.changeUserStatus(getClientUserAndValidateIt(adminBaseRequest),false);
  }

  @PostMapping(produces = "application/json",value = "/blockItem")
  public void blockItem(@RequestBody AdminItemRequest adminItemRequest) {
    Admin admin = getAndValidateAdminUser(adminItemRequest);
    ClientUser clientUser = getClientUserAndValidateIt(adminItemRequest);
    for (Item item : clientUser.getItems()) {
        if(item.getId() == adminItemRequest.getId()) {
          admin.changePostStatus(item,true);
        }
    }
  }

  @PostMapping(produces = "application/json",value = "/unblockItem")
  public void unblockItem(@RequestBody AdminItemRequest adminItemRequest) {
    Admin admin = getAndValidateAdminUser(adminItemRequest);
    ClientUser clientUser = getClientUserAndValidateIt(adminItemRequest);
    for (Item item : clientUser.getItems()) {
      if(item.getId() == adminItemRequest.getId()) {
        admin.changePostStatus(item,false);
      }
    }
  }


  private Admin getAndValidateAdminUser(AdminBaseRequest adminBaseRequest) {
    Admin admin;
    User user = UsersMap.getUsersInstance().getUser(adminBaseRequest.getAdmin().getUserName());
    if (user == null) {
      throw new UserDoesNotExistException("This User: " + adminBaseRequest.getAdmin().getUserName() + " Does Not Exist");
    }
    try {
      admin = (Admin) user;
    } catch (ClassCastException e) {
      throw new UserIsNotAdminException("The User Does Not Have enough privileges");
    }
    return admin;
  }

  private ClientUser getClientUserAndValidateIt(AdminBaseRequest adminBaseRequest) {
    ClientUser clientUser;
    User user = UsersMap.getUsersInstance().getUser(adminBaseRequest.getUserName());
    if (user == null) {
      throw new UserDoesNotExistException("This User: " + adminBaseRequest.getUserName() + " Does Not Exist");
    }
    try {
      clientUser = (ClientUser) user;
    } catch (ClassCastException e) {
      throw new UserIsNotAClientUserException("The User Does is Not a Client User");
    }
    return clientUser;
  }
}
