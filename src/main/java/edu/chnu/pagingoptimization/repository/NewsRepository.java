package edu.chnu.pagingoptimization.repository;

import edu.chnu.pagingoptimization.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  NewsRepository
  @version  1.0.0 
  @since 11.06.23 - 14.48
*/
@Repository
    public interface NewsRepository extends CrudRepository<Item, Integer> {
    Page<Item> findAll(Pageable pageable);
    Page<Item> findTop10ByOrderByTimeDesc();


}
