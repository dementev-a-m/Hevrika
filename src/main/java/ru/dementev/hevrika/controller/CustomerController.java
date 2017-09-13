package ru.dementev.hevrika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dementev.hevrika.entity.Customer;
import ru.dementev.hevrika.service.CustomerServiceImpl;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.POST)
    @ResponseBody
    public List<Customer> findAll(){
        return service.getAll();
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Customer findById(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set/new",method = RequestMethod.POST)
    @ResponseBody
    public Customer setNew(@RequestBody Customer customer){
        return service.set(customer);
    }
    @RequestMapping(value = "/set",method = RequestMethod.PUT)
    @ResponseBody
    public Customer set(@RequestBody Customer customer){
        return service.set(customer);
    }
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String remove(@PathVariable long id){
        return service.remove(id);
    }

}
