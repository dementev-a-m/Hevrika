package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dementev.hevrika.entity.Customer;
import ru.dementev.hevrika.entity.Product;
import ru.dementev.hevrika.repository.ProductRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;


    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product getById(long id) {
        return repository.findOne(id);
    }

    public Product set(Product product) {
        return repository.save(product);
    }

    public String remove(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
