package com.bdqn.biz.service;

import com.bdqn.beans.pojo.ItripUser;

/**
 *@ClassName:
 *@Description: 爱旅行用户业务接口
 *@Author:lzq
 *@Date: 2019/9/17 16:10
 **/

public interface IItripUserService {

    ItripUser findItripUserById(Long id);
}
