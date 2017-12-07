package com.ykp.feignconsumer.service;

import com.ykp.helloserviceapi.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Author: yangkunpeng
 * @Date 2017/12/7 19:25
 */
@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService {
}
