package com.lxs.legou.search;

import com.lxs.legou.po.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SearchApplication.class)
public class EsTest {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void testCreateIndex() {
        // 创建索引库
        this.elasticsearchTemplate.createIndex(Goods.class);
        // 创建映射
        this.elasticsearchTemplate.putMapping(Goods.class);
    }

}