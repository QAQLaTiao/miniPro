package com.v.service.impl;

import com.v.dao.MoneyDao;
import com.v.model.Money;
import com.v.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * IMoneyService数据库操作接口类
 *
 * @author QAQ
 */
@Service
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneyDao moneyDao;

    @Override
    public int addMoney(Money money) {

        return moneyDao.insert(money);
    }
}