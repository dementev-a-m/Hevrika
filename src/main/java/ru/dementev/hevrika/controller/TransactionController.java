package ru.dementev.hevrika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dementev.hevrika.entity.Transaction;
import ru.dementev.hevrika.service.TransactionServiceImpl;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@RestController
@RequestMapping("/transaction")
public class TransactionController {


    @Autowired
    private TransactionServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Transaction> findAll(){

        return service.getAll();
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Transaction findById(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set/new",method = RequestMethod.POST)
    @ResponseBody
    public Transaction setNew(@RequestBody Transaction transaction){
        return service.set(transaction);
    }
    @RequestMapping(value = "/set",method = RequestMethod.PUT)
    @ResponseBody
    public Transaction set(@RequestBody Transaction transaction){
        return service.set(transaction);
    }
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String remove(@PathVariable long id){
        return service.remove(id);
    }

}
