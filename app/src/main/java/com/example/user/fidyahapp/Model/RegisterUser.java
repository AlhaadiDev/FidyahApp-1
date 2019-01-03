package com.example.user.fidyahapp.Model;

public class RegisterUser {

    String key;
    String UserEmail;
    String UserName;
    String UserPassword;
    String UserPhone;

    public RegisterUser() {
    }

    public RegisterUser(String key, String UserName, String UserPassword, String UserEmail, String UserPhone) {
        this.key = key;
        this.UserEmail = UserEmail;
        this.UserName = UserName;
        this.UserPassword = UserPassword;
        this.UserPhone = UserPhone;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setUserEmail(String userEmail) {
        this.UserEmail = userEmail;
    }

    public void setUserPassword(String userPassword) {
        this.UserPassword = userPassword;
    }

    public void setUserPhone(String userPhone) {
        this.UserPhone = userPhone;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getKey() {
        return key;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public String getUserName() {
        return UserName;
    }
}
