package com.cecgw.cq.trafficsys.trafficsyscustomer.remote;

import com.cecgw.cq.trafficsys.trafficsyscustomer.dto.CustomerDto;
import com.cecgw.cq.trafficsys.trafficsyscustomer.dto.RecordDto;
import com.cecgw.cq.trafficsys.trafficsyscustomer.remote.hystrix.ConsumerServiceImpl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "trafficsys-test", fallback = ConsumerServiceImpl.class)
public interface ConsumerService {
    @RequestMapping(value = "/record/getAllRc",method = RequestMethod.POST)
    RecordDto getAllRc(CustomerDto customerDto);
}
