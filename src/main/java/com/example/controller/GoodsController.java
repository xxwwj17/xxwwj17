package com.example.controller;

import com.example.entity.BrankEntity;
import com.example.entity.GoodsEntity;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/login")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    private GoodsEntity goods;
    private BrankEntity brank;

    /**
     * 添加商品
     * @param goods
     * @return
     */
    @GetMapping(value = "insertGoods")
    public Integer insertGoods(GoodsEntity goods) {
        return insertGoods(goods);
    }

    /**
     * 删除商品
     * @param goods_id
     * @return
     */

    @GetMapping(value = "deleteByGoodsKey")
    public Integer deleteByGoodsKey(Integer goods_id) {
        return goodsService.deleteByGoodsKey(goods_id);
    }

    /**
     * 修改商品
     * @param goods
     * @return
     */
    //@ResponseBody
    @GetMapping(value = "updateByGoodsKey")
    public Integer updateByGoodsKey(GoodsEntity goods) {
        return goodsService.updateByGoodsKey(goods);
    }

    /**
     * 分页查询
     * @param startIndex,pageSize
     * @return
     */
    //@ResponseBody
    @GetMapping(value = "selectForPage")
    public List selectForPage(Integer startIndex, Integer pageSize) {
        return goodsService.selectForPage(startIndex,pageSize);
    }


}
