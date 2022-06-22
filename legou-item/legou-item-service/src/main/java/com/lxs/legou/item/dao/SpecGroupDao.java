package com.lxs.legou.item.dao;

import java.util.List;

import com.lxs.legou.core.dao.ICrudDao;
import com.lxs.legou.item.po.SpecGroup;

public interface SpecGroupDao extends ICrudDao<SpecGroup> {

    /**
     * 根据实体类的条件生成动态sql语句查询规格分组
     *
     * @param specGroup
     * @return
     */
    List<SpecGroup> selectList(SpecGroup specGroup);

}
