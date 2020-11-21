package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author chengpunan
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut";
    }
}
