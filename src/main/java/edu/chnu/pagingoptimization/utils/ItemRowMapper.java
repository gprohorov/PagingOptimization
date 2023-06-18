package edu.chnu.pagingoptimization.utils;
/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  ItemRowMapper
  @version  1.0.0 
  @since 18.06.23 - 20.15
*/

import edu.chnu.pagingoptimization.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemRowMapper implements RowMapper<Item> {


    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {

        Item item = new Item();
        item.setId(rs.getInt("ID"));
        item.setContent(rs.getString("content"));
        item.setContent(String.valueOf(rs.getInt("category_Id")));
        item.setContent(String.valueOf(rs.getDate("time")));

        return item;
    }
}
