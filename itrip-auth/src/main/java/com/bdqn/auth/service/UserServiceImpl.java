package com.bdqn.auth.service;


import com.bdqn.auth.exception.UserLoginFailedException;
import com.bdqn.beans.pojo.ItripUser;
import com.bdqn.dao.ItripUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * 用户管理接口的实现
 * @author hduser
 *
 */
@Service("useService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private ItripUserMapper itripUserMapper;

	@Override
	public ItripUser findByUsername(String username) throws Exception {
		Map<String, Object> param=new HashMap();
		param.put("userCode", username);
		List<ItripUser> list= itripUserMapper.getItripUserListByMap(param);
		if(list.size()>0)
			return list.get(0);
		else
			return null;
	}

	@Override
	public ItripUser login(String name, String password) throws Exception {
		// TODO Auto-generated method stub
		ItripUser user=this.findByUsername(name);
		if(null!=user&&user.getUserPassword().equals(password))
		{
			if(user.getActivated()!=1){
				throw new UserLoginFailedException("用户未激活");
			}
			return user;
		}
		else
			return null;
	}


}
