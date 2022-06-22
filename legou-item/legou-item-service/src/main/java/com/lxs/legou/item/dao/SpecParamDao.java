package com.lxs.legou.item.dao;

import java.util.List;

import com.lxs.legou.core.dao.ICrudDao;
import com.lxs.legou.item.po.SpecParam;
import org.apache.ibatis.annotations.Select;

public interface SpecParamDao extends ICrudDao<SpecParam> {

    @Select("select * from spec_param_ where group_id_ = #{groupId}")
    List<SpecParam> findByGroupId(Integer groupId);

}