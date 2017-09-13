package ru.dementev.hevrika.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.hevrika.entity.Customer;
import ru.dementev.hevrika.repository.CustomerRepository;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer findById(long id) {
        return repository.findOne(id);
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public String delete(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
