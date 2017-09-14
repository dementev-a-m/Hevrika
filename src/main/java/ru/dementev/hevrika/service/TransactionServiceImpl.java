package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dementev.hevrika.entity.Transaction;
import ru.dementev.hevrika.repository.TransactionRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository repository;

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction getById(long id) {
        return repository.findOne(id);
    }

    public Transaction set(Transaction transaction) {
        return repository.save(transaction);
    }


    public String remove(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
