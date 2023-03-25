package org.leon.controller;

import org.leon.config.ServerConfig;
import org.leon.pojo.CommonResult;
import org.leon.pojo.Payment;
import org.leon.service.StandardRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private StandardRestTemplate standardRestTemplate;
    @Autowired
    private ServerConfig serverConfig;

    @RequestMapping(value = "/getOrderPayment", method = RequestMethod.POST)
    public CommonResult<Object> getOrderPaymentInfo(@RequestBody Payment payment) {
        String url = serverConfig.paymentServerHost + "/payment/pay/queryPaymentInfo";
        return standardRestTemplate.sendByPost(url, payment, CommonResult.class);

    }

}
