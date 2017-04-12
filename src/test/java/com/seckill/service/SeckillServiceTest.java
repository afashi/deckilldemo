package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by afas on 2017/4/13.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SeckillServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list = {}", list);
    }

    @Test
    public void getSeckillById() throws Exception {
        Seckill seckill = seckillService.getSeckillById(1000);
        logger.info("seckill={}", seckill);
    }

    @Test
    public void exposeSeckillUrl() throws Exception {
        long id = 3000L;
        Exposer exposer = seckillService.exposeSeckillUrl(id);
        logger.info("exposer={}", exposer);
    }

    @Test
    public void executeSeckill() throws Exception {
        try {
            SeckillExecution seckillExecution = seckillService.executeSeckill(3000, 124343, "5f137843c2aeed76933b3f776f192e86");
            logger.info("successKilled={}", seckillExecution);
        } catch (RepeatKillException e) {
            logger.info(e.getMessage());
        } catch (SeckillCloseException e) {
            logger.info(e.getMessage());
        }

    }

    @Test
    public void seckillAll() throws Exception {
        long id = 3000L;
        Exposer exposer = seckillService.exposeSeckillUrl(id);
        logger.info("exposer={}", exposer);
        if (exposer.isExposed()) {
            try {
                SeckillExecution seckillExecution = seckillService.executeSeckill(id, 124243, exposer.getMd5());
                logger.info("successKilled={}", seckillExecution);
            } catch (RepeatKillException e) {
                logger.info(e.getMessage());
            } catch (SeckillCloseException e) {
                logger.info(e.getMessage());
            }
        }

    }

}