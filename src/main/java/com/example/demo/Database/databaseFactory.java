package com.example.demo.Database;

import com.example.demo.Database.H2.H2Repository;
import org.springframework.stereotype.Component;

@Component("databaseFactory")
public class databaseFactory {
    //Note basics : Runtime decide type of database Object
    public final RepositoryInterface getdatabase(String databaseType) {
        if (databaseType.equalsIgnoreCase("HO"))
            return new H2Repository();
        return null;
    }
}