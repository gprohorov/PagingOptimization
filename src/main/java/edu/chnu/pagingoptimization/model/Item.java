package edu.chnu.pagingoptimization.model;
/*
  @author   Verjack Dmytro
  @project   PagingOptimization
  @class  Item
  @version  1.0.0 
  @since 11.06.23 - 14.28
*/


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String content;
    private int categoryId;
    private LocalDateTime time;

}
