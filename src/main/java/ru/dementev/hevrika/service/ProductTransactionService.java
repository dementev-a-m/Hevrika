package ru.dementev.hevrika.service;

import ru.dementev.hevrika.entity.ProductTransaction;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public interface ProductTransactionService {
    public List<ProductTransaction> findAll();
    public ProductTransaction findById(long id);
    public ProductTransaction save(ProductTransaction productTransaction);
    public String delete(long id);

}
