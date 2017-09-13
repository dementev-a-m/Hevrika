package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.hevrika.entity.Customer;
import ru.dementev.hevrika.entity.Product;
import ru.dementev.hevrika.repository.ProductRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;


    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(long id) {
        return repository.findOne(id);
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public String delete(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
