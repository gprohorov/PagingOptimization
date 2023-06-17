package edu.chnu.pagingoptimization.service;
/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  IItemService
  @version  1.0.0 
  @since 11.06.23 - 14.51
*/

import edu.chnu.pagingoptimization.model.Item;

import java.util.List;

public interface IItemService {
        Item get(int id);
        Item create(Item item);
        Item update(Item item);

        void delete(int id);

        List<Item> getAllNews();

}
