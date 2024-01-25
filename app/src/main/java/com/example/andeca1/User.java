package com.example.andeca1;

public class User {

    int userid;
    String username;
    String email;
    String password;

    public User(int userid, String email, String username, String password) {
        this.username = username;
        this.userid = userid;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public int getUserid() {
        return this.userid;
    }

    public void setUserid(int id) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
