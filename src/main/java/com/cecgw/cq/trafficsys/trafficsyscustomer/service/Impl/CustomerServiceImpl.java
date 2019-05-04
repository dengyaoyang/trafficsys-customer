package com.cecgw.cq.trafficsys.trafficsyscustomer.service.Impl;

import com.cecgw.cq.trafficsys.trafficsyscustomer.entity.Customer;
import com.cecgw.cq.trafficsys.trafficsyscustomer.repository.CustomerRepo;
import com.cecgw.cq.trafficsys.trafficsyscustomer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-04
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepo customerRepo;
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }
}
