package ru.dementev.hevrika.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import ru.dementev.hevrika.entity.Customer;
import ru.dementev.hevrika.service.CustomerServiceImpl;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by adementev on 13.09.2017.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

//    @Autowired
//    private ObjectMapper objectMapper;
   // private final Logger logger = (Logger) LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private CustomerServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
        public List<Customer> findAll(){
      //  logger.info("Listing customer!");
        List<Customer> customerList = service.getAll();

     //   logger.info("No. of contacts: " + customerList.size());
        return customerList;
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Customer findById(@PathVariable long id){
        return service.getById(id);
    }
    @RequestMapping(value = "/getByName/{firstName}", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> findByName(@PathVariable String firstName){
        return service.getByName(firstName);
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
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable long id){
        return service.remove(id);
    }



}
