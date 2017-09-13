package ru.dementev.hevrika.service;

import ru.dementev.hevrika.entity.Product;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public interface ProductService {
    public List<Product> findAll();
    public Product findById(long id);
    public Product save(Product product);
    public String delete(long id);

}
