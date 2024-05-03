package com.entity.model;

import com.entity.MinzhutoupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 民主投票
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public class MinzhutoupiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 选项a
	 */
	
	private Integer xuanxianga;
		
	/**
	 * 选项b
	 */
	
	private Integer xuanxiangb;
		
	/**
	 * 选项c
	 */
	
	private Integer xuanxiangc;
		
	/**
	 * 选项d
	 */
	
	private Integer xuanxiangd;
		
	/**
	 * 投票内容
	 */
	
	private String toupiaoneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：选项a
	 */
	 
	public void setXuanxianga(Integer xuanxianga) {
		this.xuanxianga = xuanxianga;
	}
	
	/**
	 * 获取：选项a
	 */
	public Integer getXuanxianga() {
		return xuanxianga;
	}
				
	
	/**
	 * 设置：选项b
	 */
	 
	public void setXuanxiangb(Integer xuanxiangb) {
		this.xuanxiangb = xuanxiangb;
	}
	
	/**
	 * 获取：选项b
	 */
	public Integer getXuanxiangb() {
		return xuanxiangb;
	}
				
	
	/**
	 * 设置：选项c
	 */
	 
	public void setXuanxiangc(Integer xuanxiangc) {
		this.xuanxiangc = xuanxiangc;
	}
	
	/**
	 * 获取：选项c
	 */
	public Integer getXuanxiangc() {
		return xuanxiangc;
	}
				
	
	/**
	 * 设置：选项d
	 */
	 
	public void setXuanxiangd(Integer xuanxiangd) {
		this.xuanxiangd = xuanxiangd;
	}
	
	/**
	 * 获取：选项d
	 */
	public Integer getXuanxiangd() {
		return xuanxiangd;
	}
				
	
	/**
	 * 设置：投票内容
	 */
	 
	public void setToupiaoneirong(String toupiaoneirong) {
		this.toupiaoneirong = toupiaoneirong;
	}
	
	/**
	 * 获取：投票内容
	 */
	public String getToupiaoneirong() {
		return toupiaoneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
			
}
