package ru.dementev.hevrika.service;

import ru.dementev.hevrika.entity.Customer;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(long id);
    public Customer save(Customer customer);
    public String delete(long id);

}
