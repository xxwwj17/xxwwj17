package com.example.service;
import com.example.entity.GoodsEntity;

import java.util.List;

public interface GoodsService {
    /**
     * 获取分页数据
     * @param
     * @return
     */
    List<GoodsEntity> selectForPage(Integer startIndex,Integer pageSize);

    /**
     * 删除商品数据
     * @param goods_id
     * @return
     */
    int deleteByGoodsKey(Integer goods_id);

    /**
     * 插入商品数据
     * @param goods
     * @return
     */
    int insertGoods(GoodsEntity goods);

    /**
     * 修改商品数据
     * @param goods
     * @return
     */
    int updateByGoodsKey(GoodsEntity goods);
}
