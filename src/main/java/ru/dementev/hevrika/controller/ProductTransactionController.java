package ru.dementev.hevrika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dementev.hevrika.entity.ProductTransaction;
import ru.dementev.hevrika.service.ProductTransactionServiceImpl;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@RestController
@RequestMapping("/product_transaction")
public class ProductTransactionController {


    @Autowired
    private ProductTransactionServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductTransaction> findAll(){

        return service.getAll();
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ProductTransaction findById(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set/new",method = RequestMethod.POST)
    @ResponseBody
    public ProductTransaction setNew(@RequestBody ProductTransaction productTransaction){
        return service.set(productTransaction);
    }
    @RequestMapping(value = "/set",method = RequestMethod.PUT)
    @ResponseBody
    public ProductTransaction set(@RequestBody ProductTransaction productTransaction){
        return service.set(productTransaction);
    }
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String remove(@PathVariable long id){
        return service.remove(id);
    }

}
