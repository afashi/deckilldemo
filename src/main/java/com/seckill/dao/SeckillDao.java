package com.seckill.dao;

import com.seckill.entity.Seckill;
import com.sun.scenario.effect.Offset;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by zhou on 2017-04-03.
 */
public interface SeckillDao {
    /**
     * 减少库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    /**
     * 获取
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 查询列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
