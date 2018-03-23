package com.v.dao;

import com.v.model.Money;

/**
 * 
 * MoneyMapper数据库操作接口类
 * 
 **/

public interface MoneyDao {


	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	Money selectByPrimaryKey(Long id);

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
	int insert(Money record);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	int insertSelective(Money record);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	int updateByPrimaryKeySelective(Money record);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(Money record);

}