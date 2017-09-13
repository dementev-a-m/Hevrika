package ru.dementev.hevrika.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

@Entity
@Table(name = "product")
public class Product implements Serializable{
    private long id;
    private byte[] photo;
    private String name;
    private double price;
    private int rest;
    private int numberOfSales;

    public Product() {
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
    @Column(name ="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Column(name = "rest")
    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }
    @Column(name = "number_of_sales")
    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }
    @Lob
    @Column(name = "photo")
    @Basic(fetch =FetchType.LAZY)
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (rest != product.rest) return false;
        if (numberOfSales != product.numberOfSales) return false;
        if (!Arrays.equals(photo, product.photo)) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rest;
        result = 31 * result + numberOfSales;
        return result;
    }
}
