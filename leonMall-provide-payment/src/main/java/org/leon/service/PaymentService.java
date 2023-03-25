package org.leon.service;

import org.leon.pojo.Payment;

public interface PaymentService {

    /**
     * 创建交易接口
     *
     * @param payment 交易信息
     * @return 插入成功条数
     */
    int createPayment(Payment payment);

    /**
     * 根据id查询交易信息
     *
     * @param id 交易信息id
     * @return 交易信息
     */
    Payment queryPaymentInfoById(long id);
}
