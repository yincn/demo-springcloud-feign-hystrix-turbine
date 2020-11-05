package com.example.service;

import com.example.fallback.DeptServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="PROVIDER-DEPT", fallbackFactory = DeptServiceFallback.class)
public interface DeptService {

    @RequestMapping(value = "/dept/{id}",method = RequestMethod.POST)
    String selectDept(@PathVariable("id") Integer id);
}
