package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.hevrika.entity.Transaction;
import ru.dementev.hevrika.repository.TransactionRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository repository;

    public List<Transaction> findAll() {
        return repository.findAll();
    }

    public Transaction findById(long id) {
        return repository.findOne(id);
    }

    public Transaction save(Transaction transaction) {
        return repository.save(transaction);
    }


    public String delete(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
