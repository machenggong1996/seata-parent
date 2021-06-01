package com.shengtianyizi.seatabank2.biz;

import com.shengtianyizi.seatabank2.dao.AccountInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName    AccountInfoBiz
 * Package      com.shengtianyizi.seatabank2.biz
 * Description
 *
 * @author <a href="mailto:cyf0477@126.com">cyf</a>
 * @date 2020/6/12 18:05
 */
@Service
public class AccountInfoBiz {

    @Autowired
    private AccountInfoDao accountInfoDao;

    @Transactional(rollbackFor = RuntimeException.class)
    public void updateAccountBalance(String accountNo, Double amount) {
        //李四增加金额
        int i = accountInfoDao.updateAccountBalance(accountNo, amount);
        if (amount == 100) {
            throw new RuntimeException("李四人为异常!");
        }
        System.out.println(i);
    }

}
