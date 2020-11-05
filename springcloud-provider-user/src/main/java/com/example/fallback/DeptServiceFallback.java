package com.example.fallback;

import com.example.service.DeptService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author Yincn
 * @Date 2020/11/5
 */
@Component
public class DeptServiceFallback implements FallbackFactory<DeptService> {

    Logger logger = LoggerFactory.getLogger(DeptServiceFallback.class);

    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public String selectDept(Integer id) {
                logger.warn("selectDept fallback!");
                return "fallback:" + System.currentTimeMillis();
            }
        };
    }
}
