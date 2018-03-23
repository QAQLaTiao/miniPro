package com.v.model;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Money implements Serializable {

	/****/
	 private Integer id;

	/**推荐账号**/
	 private String refereeCode;

	/**名**/
	 private String name;

	/**账号**/
	 private String userCode;

	/**金额**/
	 private Integer money;

	/**是否转账 0 否 1 是**/
	 private Integer isTransfer;

	/****/
	 private String createTime;



	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setRefereeCode(String refereeCode){
		this.refereeCode = refereeCode;
	}

	public String getRefereeCode(){
		return this.refereeCode;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setUserCode(String userCode){
		this.userCode = userCode;
	}

	public String getUserCode(){
		return this.userCode;
	}

	public void setMoney(Integer money){
		this.money = money;
	}

	public Integer getMoney(){
		return this.money;
	}

	public void setIsTransfer(Integer isTransfer){
		this.isTransfer = isTransfer;
	}

	public Integer getIsTransfer(){
		return this.isTransfer;
	}

	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	public String getCreateTime(){
		return this.createTime;
	}

}
