package com.example.demo.Interactors.User;

import org.springframework.stereotype.Component;

@Component("UserFactory")
public class UserFactory {
    public final static UserRegister createUserInterface(){
        return new userRegisterImpl();
    }
}
