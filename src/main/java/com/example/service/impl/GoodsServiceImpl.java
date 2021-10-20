package com.example.service.impl;


import com.example.dao.BrankDao;
import com.example.dao.GoodsDao;
import com.example.entity.BrankEntity;
import com.example.entity.GoodsEntity;
import com.example.service.GoodsService;
import com.example.service.BrankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService,BrankService {

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private BrankDao brankDao;

    @Override
    public List<GoodsEntity> selectForPage(Integer startIndex,Integer pageSize) {
        List<GoodsEntity> list = goodsDao.selectForPage(startIndex,pageSize);
        List goodslist = new ArrayList();
        for (int i = 0 ;i<list.size();i++) {
            List<BrankEntity> branklist = brankDao.selectByBrankKey(list.get(i).getBrank_id().intValue());
            goodslist.add(list.get(i));
            goodslist.add(branklist);
        }
        return goodslist;
    }

    @Override
    public int insertGoods(GoodsEntity goods) {
        return goodsDao.insertGoods(goods);
    }


    @Override
    public int deleteByGoodsKey(Integer goods_id) {
        return goodsDao.deleteByGoodsKey(goods_id);
    }

    @Override
    public int updateByGoodsKey(GoodsEntity goods) {
        return goodsDao.updateByGoodsKey(goods);
    }

    @Override
    public List<BrankEntity> selectByBrankKey(Integer brank_id) {
        return null;
    }
}
