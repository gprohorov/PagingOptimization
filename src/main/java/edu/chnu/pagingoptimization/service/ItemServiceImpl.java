package edu.chnu.pagingoptimization.service;
/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 11.06.23 - 14.53
*/

import edu.chnu.pagingoptimization.model.Item;
import edu.chnu.pagingoptimization.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    NewsRepository repository;

    public Page<Item> getPage(int number) {
        Pageable sortedByTimeDesc = PageRequest.of(
                number,
                10,
                Sort.by("time")
                        .descending());
        return repository.findAll(sortedByTimeDesc);
    }


    public Page<Item> get10LastNews(){
        return repository.findTop10ByOrderByTimeDesc();
    }

    @Override
    public Item get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Item create(Item item) {
        return repository.save(item);
    }

    @Override
    public Item update(Item item) {
        return repository.save(item);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Item> getAllNews() {
        return (List<Item>) repository.findAll();
    }

}
