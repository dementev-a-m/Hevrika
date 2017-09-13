package ru.dementev.hevrika.entity;

import javax.persistence.*;

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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "transaction_id")
    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    @OneToOne
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    @Column(name="price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductTransaction that = (ProductTransaction) o;

        if (id != that.id) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (number != that.number) return false;
        if (transaction != null ? !transaction.equals(that.transaction) : that.transaction != null) return false;
        return product != null ? product.equals(that.product) : that.product == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (transaction != null ? transaction.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + number;
        return result;
    }
}
