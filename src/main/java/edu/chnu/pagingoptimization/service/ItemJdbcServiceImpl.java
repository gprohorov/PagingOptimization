package edu.chnu.pagingoptimization.service;
/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 11.06.23 - 14.53
*/

import edu.chnu.pagingoptimization.model.Item;
import edu.chnu.pagingoptimization.repository.ItemJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ItemJdbcServiceImpl implements IItemService {

    @Autowired
    ItemJdbcRepository repository;

    public List<Item> getPage(int number) {
        return repository.findTop10();
    }


    public List<Item> get10LastNews(){
        return repository.findTop10ByOrderByTimeDesc();
    }

    @Override
    public Item get(int id) {
        return null;
    }

    @Override
    public Item create(Item item) {
        return null;
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Item> getAllNews() {
        return repository.findAll();
    }

}
