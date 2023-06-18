package edu.chnu.pagingoptimization.repository;

import edu.chnu.pagingoptimization.model.Item;
import edu.chnu.pagingoptimization.utils.ItemRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  ItemJdbcRepository
  @version  1.0.0 
  @since 08.06.23 - 21.41
*/
@Repository
public class ItemJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<Item> findAll() {
        return jdbcTemplate.query("select * from news", new ItemRowMapper());
    }

    @Transactional(readOnly=true)
    public List<Item> findTop10ByOrderByTimeDesc() {
        return jdbcTemplate.query("SELECT * FROM news WHERE category_id = 1234 ORDER\n" +
                "BY date, id DESC LIMIT 10;", new ItemRowMapper());
    }

    @Transactional(readOnly=true)
    public List<Item> findTop10() {
        return jdbcTemplate.query("SELECT * FROM news WHERE category_id = 1234 AND\n" +
                "(date, id) < (prev_date, prev_id) ORDER BY date DESC,\n" +
                "id DESC LIMIT 10;", new ItemRowMapper());
    }


}
