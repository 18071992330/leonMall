package org.leon.service.impl;

import org.leon.dao.PaymentDao;
import org.leon.pojo.Payment;
import org.leon.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    @Override
    public Payment queryPaymentInfoById(long id) {
        return paymentDao.queryPaymentInfoById(id);
    }

}
