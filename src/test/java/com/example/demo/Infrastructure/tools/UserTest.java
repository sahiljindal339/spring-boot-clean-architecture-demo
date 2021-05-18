package com.example.demo.Infrastructure.tools;

import com.example.demo.Entity.User.User;
import com.example.demo.Entity.User.UserDTO;
import org.junit.Test;

public class UserTest {

    @Test
    public void testtoJsonMapper(){
        User p = new User("a" , "b" , "c"  , "d" , "e");
        Object temp=JsonMapper.toJsonMapper(p , UserDTO.class);
        System.out.println(temp.toString());
    }
}
