package ru.dementev.hevrika.entity;

/**
 * Created by adementev on 28.07.2017.
 */
public class ProductTransaction {
    private long id;
    private Transaction transaction;
    private Product product;
    private double price;
    private int number;


    public ProductTransaction() {
    }

    public ProductTransaction(Transaction transaction, Product product) {
        this.transaction = transaction;
        this.product = product;
        this.number = 1;
    }

}
