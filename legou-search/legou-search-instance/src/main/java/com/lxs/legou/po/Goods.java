package com.lxs.legou.po;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author bing.zhang06@hand-china.com 2022/6/29 15:55
 **/
@Data
@Document(indexName = "goods_legou", type = "docs_legou", shards = 1, replicas = 0)
public class Goods {
    @Id
    private Long id; //spuId

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String all; //用来搜索的字段，包括标题，分类和品牌

    @Field(type = FieldType.Keyword, index = false)
    private String subTitle; //卖点

    private Long brandId;// 品牌id

    private Long cid1;// 1级分类id

    private Long cid2;// 2级分类id

    private Long cid3;// 3级分类id

    private Date createTime;// 创建时间

    private List<Long> price;// 价格

    @Field(type = FieldType.Keyword, index = false)
    private String skus; //sku信息-> json结构

    private Map<String, Object> specs; //可搜索的规格参数,key:参数名，value：参数值
}
