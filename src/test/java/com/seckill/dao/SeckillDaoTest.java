package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by afas on 2017/4/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillDaoTest {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {
        seckillDao.reduceNumber(1000l, new Date());
    }

    @Test
    public void queryById() throws Exception {
        long id = 1000L;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill.getNumber());
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for (Seckill seckill : seckills) {
            System.out.println(seckill);
        }
    }

}