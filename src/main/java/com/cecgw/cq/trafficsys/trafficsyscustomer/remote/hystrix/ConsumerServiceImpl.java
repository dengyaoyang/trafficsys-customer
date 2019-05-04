package com.cecgw.cq.trafficsys.trafficsyscustomer.remote.hystrix;

import com.cecgw.cq.trafficsys.trafficsyscustomer.dto.CustomerDto;
import com.cecgw.cq.trafficsys.trafficsyscustomer.dto.RecordDto;
import com.cecgw.cq.trafficsys.trafficsyscustomer.remote.ConsumerService;
import org.springframework.stereotype.Component;


/**
 * @author denghualin
 * @version V1.0
 * @since 2019-05-03
 */
@Component
public class ConsumerServiceImpl implements ConsumerService {
    public RecordDto getAllRc(CustomerDto customerDto) {
        RecordDto recordDto = new RecordDto();
        recordDto.setMsg("发生错误");
        return recordDto;
    }
}
