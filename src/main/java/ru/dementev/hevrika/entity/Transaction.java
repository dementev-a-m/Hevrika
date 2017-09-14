package ru.dementev.hevrika.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import org.hibernate.annotations.Type;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by adementev on 28.07.2017.
 */
@Entity
@Table(name = "transaction")
public class Transaction {

    private long id;
    private Customer customer;
    private double sum;
    private Date date;
    private List<ProductTransaction> productTransactionList;

    public Transaction() {

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
    @JoinColumn(name ="customer_id")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Column(name = "sum")
    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
//    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name ="date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
//    @Transient
//    public String  getDateString() {
//
//        String dateString = "";
//        if (date != null)
//            dateString = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd hh:mm:ss").print(DateTime.parse(date.toString()));
//
//        return dateString;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (id != that.id) return false;
        if (Double.compare(that.sum, sum) != 0) return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        return productTransactionList != null ? productTransactionList.equals(that.productTransactionList) : that.productTransactionList == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        temp = Double.doubleToLongBits(sum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (productTransactionList != null ? productTransactionList.hashCode() : 0);
        return result;
    }
}
