package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.hevrika.entity.ProductTransaction;
import ru.dementev.hevrika.repository.ProductTransactionRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public class ProductTransactionServiceImpl implements ProductTransactionService {
    @Autowired
    private ProductTransactionRepository repository;

    public List<ProductTransaction> findAll() {
        return repository.findAll();
    }

    public ProductTransaction findById(long id) {
        return repository.findOne(id);
    }

    public ProductTransaction save(ProductTransaction productTransaction) {
        return repository.save(productTransaction);
    }

    public String delete(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
