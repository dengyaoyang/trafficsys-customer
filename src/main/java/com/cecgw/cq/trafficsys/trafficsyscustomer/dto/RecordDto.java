package com.cecgw.cq.trafficsys.trafficsyscustomer.dto;

import com.cecgw.cq.trafficsys.trafficsyscustomer.entity.Record;
import lombok.Data;

/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-03
 */
@Data
public class RecordDto {
    private Record record;
    private String msg;
}
