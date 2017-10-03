package ru.dementev.hevrika.entity;

/**
 * Created by adementev on 18.09.2017.
 */
public class User {
    private String login;
    private String password;
    //private Customer customer;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
