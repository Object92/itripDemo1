package com.bdqn.biz.service.impl;

import com.bdqn.beans.pojo.ItripUser;
import com.bdqn.biz.service.IItripUserService;
import com.bdqn.dao.ItripUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *@ClassName:
 *@Description: TODO 爱旅行用户业务接口实现类
 *@Author:lzq
 *@Date: 2019/9/17 16:11
 **/
@Service
@Transactional// 同一进行事务处理
public class ItripUserService implements IItripUserService {

    @Autowired
    private ItripUserMapper itripUserMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    public ItripUser findItripUserById(Long id) {
        ItripUser itripUser= null;
        try {
            itripUser = itripUserMapper.getItripUserById(id);
            if(itripUser==null){
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itripUser;
    }
}
