package org.leon.Controller;

import org.leon.pojo.CommonResult;
import org.leon.pojo.Payment;
import org.leon.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付接口控制器
 */
@RestController
@RequestMapping(value = "/pay")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createPayment(@RequestBody Payment payment) {
        CommonResult result;
        int num = service.createPayment(payment);
        result = num > 0 ? new CommonResult(200, "创建交易成功") : new CommonResult(500, "创建交易失败，请重试");
        return result;
    }

    @RequestMapping(value = "/queryPaymentInfo")
    public CommonResult<Payment> queryPaymentInfo(@RequestBody Payment payment) {
        long id = payment.getId();
        Payment result = service.queryPaymentInfoById(id);
        return result == null ? new CommonResult(500, "8007端口未查到对应的交易记录") : new CommonResult(200, "查询成功", result);
    }

}
