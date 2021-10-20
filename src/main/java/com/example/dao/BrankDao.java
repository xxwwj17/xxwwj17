package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.BrankEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrankDao extends BaseMapper<BrankEntity> {

    /**
     * 获取品牌信息
     * @param brank_id
     * @return
     */
    List<BrankEntity> selectByBrankKey(Integer brank_id);

}
