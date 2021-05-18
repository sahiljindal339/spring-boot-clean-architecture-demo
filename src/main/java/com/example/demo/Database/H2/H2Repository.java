package com.example.demo.Database.H2;

import com.example.demo.Database.RepositoryInterface;

public class H2Repository  implements RepositoryInterface {
    @Override
    public String add(Object user) {
        // basic implementation of `H2`
         return "New User add in h2";
    }
}
