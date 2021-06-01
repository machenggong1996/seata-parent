package com.shengtianyizi.seatabank1.feign;

import org.springframework.stereotype.Component;

/**
 * ClassName    Bank2FallBack
 * Package      com.shengtianyizi.bank1.feign
 * Description
 *
 * @author <a href="mailto:cyf0477@126.com">cyf</a>
 * @date 2020/6/11 18:04
 */
@Component
public class Bank2FallBack implements Bank2Feign {
    @Override
    public boolean transfer(Double amount) {
        return false;
    }
}
