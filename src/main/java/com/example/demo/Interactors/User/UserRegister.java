package com.example.demo.Interactors.User;

import java.io.IOException;

public interface UserRegister {
    // Note : User case `USER`
    //      * add New User
    //      * Update Existing User
    String addUser(String userDetails) throws IOException;
    String  updateUser(String updateUserDetails);
}
