package com.bdqn.auth.service;

import com.bdqn.beans.pojo.ItripUser;

/**
 * 用户管理接口
 * @author hduser
 *
 */
public interface UserService {


	public ItripUser login(String name, String password) throws Exception;

	public ItripUser findByUsername(String username) throws Exception;

}
