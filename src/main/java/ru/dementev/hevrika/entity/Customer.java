package ru.dementev.hevrika.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by adementev on 28.07.2017.
 */

public class Customer {
    private long id;
    private String firstName;
    private String lactName;
    private String middelName;
    private Date bithday;

    private String email;
    private String phone;


    private List<Transaction> transactions = new ArrayList<Transaction>();

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lactName='" + lactName + '\'' +
                ", middelName='" + middelName + '\'' +
                ", bithday=" + bithday +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLactName() {
        return lactName;
    }

    public void setLactName(String lactName) {
        this.lactName = lactName;
    }

    public String getMiddelName() {
        return middelName;
    }

    public void setMiddelName(String middelName) {
        this.middelName = middelName;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
