package com.cecgw.cq.trafficsys.trafficsyscustomer.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-04
 */
@Table(name = "customer")
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "uId")
    private String uId;
    @Column(name = "pwd")
    private String pwd;
}
