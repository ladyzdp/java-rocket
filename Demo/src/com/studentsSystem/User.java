package com.studentsSystem;

public class User {
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(){}
    public User(String username, String password, String personId, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
    }

    private String username;
    private String password;
    private String personId;
    private String phoneNumber;

}
