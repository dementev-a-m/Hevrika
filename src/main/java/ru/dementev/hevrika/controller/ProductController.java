package ru.dementev.hevrika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dementev.hevrika.entity.Product;
import ru.dementev.hevrika.service.ProductServiceImpl;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> findAll(){

        return service.getAll();
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product findById(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set/new",method = RequestMethod.POST)
    @ResponseBody
    public Product setNew(@RequestBody Product product){
        return service.set(product);
    }
    @RequestMapping(value = "/set",method = RequestMethod.PUT)
    @ResponseBody
    public Product set(@RequestBody Product product){
        return service.set(product);
    }
    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String remove(@PathVariable long id){
        return service.remove(id);
    }

}
