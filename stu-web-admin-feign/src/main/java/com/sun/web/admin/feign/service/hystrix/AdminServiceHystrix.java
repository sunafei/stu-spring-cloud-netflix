package com.sun.web.admin.feign.service.hystrix;

import com.sun.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * 关闭服务提供这会显示熔断信息
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}