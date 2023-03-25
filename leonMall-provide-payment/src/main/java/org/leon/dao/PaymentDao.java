package org.leon.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.leon.pojo.Payment;
import org.springframework.stereotype.Repository;

/**
 * 数据持久层服务类
 */
@Mapper
@Repository
public interface PaymentDao {
    /**
     * 交易信息入库接口
     *
     * @param payment 交易信息
     * @return 插入成功的行数
     */
    int createPayment(Payment payment);

    /**
     * 根据id查询交易信息
     *
     * @param id 交易信息id
     * @return 交易信息
     */
    Payment queryPaymentInfoById(@Param("id") long id);

}
