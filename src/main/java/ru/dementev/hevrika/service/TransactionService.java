package ru.dementev.hevrika.service;

import ru.dementev.hevrika.entity.Transaction;
import ru.dementev.hevrika.repository.TransactionRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public interface TransactionService {
    public List<Transaction> findAll();
    public Transaction findById(long id);
    public Transaction save(Transaction transaction);
    public String delete(long id);

}
