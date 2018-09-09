package com.krisp.tbd.icivic;

public class User {
    String Displayname;
    String Email;
    long createdAt;
    String phonenumber;


    public User (){};
    public User(String displayname,String email,long createdAt){
        this.Displayname = displayname;
        this.Email = email;
        this.createdAt=createdAt;
    }


    public String getDisplayname() {
        return Displayname;
    }

    public String getEmail() {
        return Email;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}