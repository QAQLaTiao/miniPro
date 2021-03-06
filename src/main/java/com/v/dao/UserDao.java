package com.v.dao;

import com.v.model.User;


/**
 * 
 * UserMapper数据库操作接口类
 * 
 **/

public interface UserDao {

	User  selectByModel(User user);

	/**
	 *
	 * 查询（根据主键ID查询）
	 *
	 **/
	User  selectByPrimaryKey(Long id);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(Long id);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(User record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(User record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(User record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(User record);

}