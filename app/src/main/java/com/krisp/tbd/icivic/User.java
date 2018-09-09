package com.krisp.tbd.icivic;

public class User {
        String Displayname;
        String Email;
        long createdAt;
        String phonenumber;


        public User() {};
        public User(String displayname, String email, long createdAt, String phonenumber){
            this.Displayname = displayname;
            this.Email = email;
            this.createdAt = createdAt;
            this.phonenumber = phonenumber;
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

        public String getPhonenumber() { return phonenumber; }
}