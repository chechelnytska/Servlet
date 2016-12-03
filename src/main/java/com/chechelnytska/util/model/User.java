package com.chechelnytska.util.model;

/**
 * Created by marina on 01.12.16.
 */
public class User {


    String UserName;
    String eMail;
    String password;

    public User(String userName, String eMail, String password) {
        UserName = userName;
        this.eMail = eMail;
        this.password = password;
    }

   public String getUserName() {
        return UserName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }


    public static User create(String userName, String email, String password) {
        return new User(userName, email, password);

    }
}
