package com.example.service.impl;

import com.example.dao.BrankDao;
import com.example.entity.BrankEntity;
import com.example.service.BrankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrankServiceImpl implements BrankService {

    @Autowired
    private BrankDao brankDao;

    @Override
    public List<BrankEntity> selectByBrankKey(Integer brank_id) {
        List<BrankEntity> list = brankDao.selectByBrankKey(brank_id);
        return list;
    }

}
