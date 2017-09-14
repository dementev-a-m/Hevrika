package ru.dementev.hevrika.service;

import ru.dementev.hevrika.entity.Transaction;
import ru.dementev.hevrika.repository.TransactionRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public interface TransactionService {
    public List<Transaction> getAll();
    public Transaction getById(long id);
    public Transaction set(Transaction transaction);
    public String remove(long id);

}
