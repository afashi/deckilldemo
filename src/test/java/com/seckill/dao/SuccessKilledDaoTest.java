package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by afas on 2017/4/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SuccessKilledDaoTest {

    @Autowired
    SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1000L;
        long phone = 1234567893L;
        int count = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("count::" + count);

    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(1000L, 1234567892L);
        System.out.println(successKilled);
    }

}