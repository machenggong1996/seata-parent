package com.shengtianyizi.seatabank2.rest;

import com.shengtianyizi.seatabank2.biz.AccountInfoBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName    AccountInfoController
 * Package      com.shengtianyizi.seatabank2.rest
 * Description
 *
 * @author <a href="mailto:cyf0477@126.com">cyf</a>
 * @date 2020/6/12 18:07
 */
@RestController
public class AccountInfoController {

    @Autowired
    private AccountInfoBiz accountInfoBiz;

    @GetMapping(value = "/transfer")
    public boolean transfer(@RequestParam(value = "amount") Double amount) {
        try {
            accountInfoBiz.updateAccountBalance("2", amount);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
