package com.sam.service;

import java.util.List;

import com.sam.entity.AssetUser;

/**
 * 用户表的service
 * 
 * @author yty
 *
 */
public interface UserService {

	/**
	 * 根据用户的角色名称查询用户
	 */
	List<AssetUser> findfindUserByUrname(String urname) throws Exception;

	/**
	 * @author gaohailong 查询所有的用户
	 * @return
	 * @throws Exception
	 */
	List<AssetUser> findAllUser() throws Exception;

	/**
	 * @author gaohailong 通过id查询用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	AssetUser findfindUserById(Integer id) throws Exception;
}
