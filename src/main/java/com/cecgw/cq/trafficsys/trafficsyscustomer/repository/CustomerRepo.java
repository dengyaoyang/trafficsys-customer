package com.cecgw.cq.trafficsys.trafficsyscustomer.repository;

import com.cecgw.cq.trafficsys.trafficsyscustomer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-04
 */
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
