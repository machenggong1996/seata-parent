package com.shengtianyizi.seatabank1.biz;

import com.shengtianyizi.seatabank1.dao.AccountInfoDao;
import com.shengtianyizi.seatabank1.entity.AccountInfo;
import com.shengtianyizi.seatabank1.feign.Bank2Feign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName    AccountInfoService
 * Package      com.shengtianyizi.seatabank1.biz
 * Description
 *
 * @author <a href="mailto:cyf0477@126.com">cyf</a>
 * @date 2020/6/12 17:52
 */
@Service
public class AccountInfoService {

    @Autowired
    private AccountInfoDao accountInfoDao;
    @Autowired
    private Bank2Feign bank2Feign;

    @GlobalTransactional(rollbackFor = RuntimeException.class)
    @Transactional(rollbackFor = RuntimeException.class)
    public void updateAccountBalance(String accountNo, Double amount) {
        //扣减张三余额
        accountInfoDao.updateAccountBalance(accountNo, amount * -1);
        boolean transfer = bank2Feign.transfer(amount);
        if (!transfer) {
            throw new RuntimeException("调用李四微服务异常");
        }
    }

}
