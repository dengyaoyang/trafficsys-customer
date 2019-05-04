package com.cecgw.cq.trafficsys.trafficsyscustomer.controller;

import com.cecgw.cq.trafficsys.trafficsyscustomer.dto.CustomerDto;
import com.cecgw.cq.trafficsys.trafficsyscustomer.dto.RecordDto;
import com.cecgw.cq.trafficsys.trafficsyscustomer.entity.Customer;
import com.cecgw.cq.trafficsys.trafficsyscustomer.entity.Record;
import com.cecgw.cq.trafficsys.trafficsyscustomer.remote.ConsumerService;
import com.cecgw.cq.trafficsys.trafficsyscustomer.repository.CustomerRepo;
import com.cecgw.cq.trafficsys.trafficsyscustomer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-03
 */
@RequestMapping("/customer")
@RestController
public class CustomerController {

    @Autowired
    ConsumerService consumerService;
    @Autowired
    CustomerService customerService;

    @RequestMapping("/getCustomerDto")
    public CustomerDto getCustomerDto(){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setPwd("mima");
        customerDto.setUId("1");
        return customerDto;
    }

    @RequestMapping(value = "queryUserRc")
    public Record queryUserRc(CustomerDto customerDto){
        return consumerService.getAllRc(customerDto).getRecord();
    }

    @RequestMapping("saveCustomer")
    public Customer saveCustomer(Customer customer){
        return customerService.save(customer);
    }
}
