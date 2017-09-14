package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dementev.hevrika.entity.ProductTransaction;
import ru.dementev.hevrika.repository.ProductTransactionRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@Service
public class ProductTransactionServiceImpl implements ProductTransactionService {
    @Autowired
    private ProductTransactionRepository repository;

    public List<ProductTransaction> getAll() {
        return repository.findAll();
    }

    public ProductTransaction getById(long id) {
        return repository.findOne(id);
    }

    public ProductTransaction set(ProductTransaction productTransaction) {
        return repository.save(productTransaction);
    }

    public String remove(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
