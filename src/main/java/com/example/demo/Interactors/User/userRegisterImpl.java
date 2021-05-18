package com.example.demo.Interactors.User;

import com.example.demo.Database.RepositoryInterface;
import com.example.demo.Database.databaseFactory;
import com.example.demo.Entity.User.User;
import com.example.demo.Entity.User.UserDTO;
import com.example.demo.Infrastructure.tools.JsonMapper;
import com.example.demo.Infrastructure.tools.tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

public class userRegisterImpl implements UserRegister {

    private final databaseFactory factory = new databaseFactory();
    private final RepositoryInterface repositoryInterface = factory.getdatabase("HO"); ;

    // Note basics : Implementation of abstract method
    //      * First we have to map String with respective Model Class
    //      * valid incoming payload
    //      * business logic we add here
    @Override
    public String addUser(String userDetails) throws IOException {
        User addUser = (User) tools.toPojo(userDetails,User.class);
        //Note : We are using JMapper API to map addUser <---> UserDTO
        //           * @param Current Model
        //           * @param Dest Model
        UserDTO userDTO = (UserDTO)JsonMapper.toJsonMapper(addUser , UserDTO.class);
        return repositoryInterface.add(userDTO);
    }

    @Override
    public String updateUser(String updateUserDetails) {
        return null;
    }
}
