package ru.dementev.hevrika.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by adementev on 28.07.2017.
 */
public class Transaction {

    private long id;
    private Customer customer;
    private double sum;
    private Date date;
    private List<ProductTransaction> productTransactionList;

    public Transaction() {

    }

    public Transaction(Customer customer) {
        this.customer = customer;
        this.date= new Date();
        this.customer.getTransactions().add(this);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
