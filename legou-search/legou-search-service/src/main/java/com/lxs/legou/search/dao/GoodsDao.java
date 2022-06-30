package com.lxs.legou.search.dao;

import com.lxs.legou.po.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface GoodsDao extends ElasticsearchCrudRepository<Goods, Long> {

}
