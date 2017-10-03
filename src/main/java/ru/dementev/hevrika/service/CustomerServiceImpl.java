package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dementev.hevrika.entity.Customer;
import ru.dementev.hevrika.repository.CustomerRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer getById(long id) {
        return repository.findOne(id);
    }

    public Customer set(Customer customer) {
        return repository.save(customer);
    }

    public String remove(long id) {
        repository.delete(id);
        return "Запись удалена";
    }

    public List<Customer> getByName(String firstName) {
        return repository.findByName(firstName);
    }
}
