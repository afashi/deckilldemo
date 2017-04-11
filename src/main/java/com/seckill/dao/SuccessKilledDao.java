package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Created by zhou on 2017-04-03.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

    /**
     * 根据id查询秒杀实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
