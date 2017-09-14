package ru.dementev.hevrika.service;

import ru.dementev.hevrika.entity.ProductTransaction;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public interface ProductTransactionService {
    public List<ProductTransaction> getAll();
    public ProductTransaction getById(long id);
    public ProductTransaction set(ProductTransaction productTransaction);
    public String remove(long id);

}
