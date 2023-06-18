package edu.chnu.pagingoptimization.controller;

import edu.chnu.pagingoptimization.service.ItemJdbcServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import edu.chnu.pagingoptimization.model.Item;

import java.util.List;

/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  NewsController
  @version  1.0.0 
  @since 11.06.23 - 15.15
*/
@RestController
@RequestMapping("/api/v1/news/")
public class NewsController {

    @Autowired
    ItemJdbcServiceImpl service;

    @RequestMapping
    public List<Item> getTop10News(){
        return service.get10LastNews();
    }

    @RequestMapping("/page/{number}")
    public List<Item> getPageof10News(@PathVariable int number){
        return service.getPage(number);
    }


    @RequestMapping
    public List<Item> getAll(){
        return service.getAllNews();
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return service.create(item);
    }

    @PutMapping
    public Item update(@RequestBody Item item) {
        return service.update(item);
    }

    @GetMapping("{id}")
    public Item get(@PathVariable int id){
        return service.get(id);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
         service.delete(id);
    }







}
