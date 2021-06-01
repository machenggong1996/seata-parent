package com.shengtianyizi.seatabank1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName    Bank2Ffeign
 * Package      com.shengtianyizi.bank1.feign
 * Description
 *
 * @author <a href="mailto:cyf0477@126.com">cyf</a>
 * @date 2020/6/11 18:01
 */
@FeignClient(value = "seata-bank2",fallback = Bank2FallBack.class)
public interface Bank2Feign {

    @GetMapping(value = "/transfer")
    public boolean transfer(@RequestParam(value = "amount") Double amount);
}
