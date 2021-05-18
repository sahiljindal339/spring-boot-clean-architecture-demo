package com.example.demo.Controller;
import com.example.demo.Interactors.User.UserRegister;
import com.example.demo.Interactors.User.UserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class UserController {

    //Note : Factory method pattern implemenntion to call `Interactors`/userInterface.
    @Autowired
    private UserFactory userFactory;
    private final UserRegister userRegister = userFactory.createUserInterface();

    // Note basics: controller is used to interact UI or User
    //    * Do not add business logic in controller
    //    * `Controller`  should be loose coupled with `Interactors`
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser() throws IOException {
        return userRegister.addUser("{\"Name\":\"Name\",\"ContactNumber\":\"ContactNumber\",\"Address\":\"Address\",\"City\":\"City\",\"Country\":\"Country\"}");
    }
}
