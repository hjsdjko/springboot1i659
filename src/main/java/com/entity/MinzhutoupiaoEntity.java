package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 民主投票
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
@TableName("minzhutoupiao")
public class MinzhutoupiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MinzhutoupiaoEntity() {
		
	}
	
	public MinzhutoupiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 投票主题
	 */
					
	private String toupiaozhuti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：投票主题
	 */
	public void setToupiaozhuti(String toupiaozhuti) {
		this.toupiaozhuti = toupiaozhuti;
	}
	/**
	 * 获取：投票主题
	 */
	public String getToupiaozhuti() {
		return toupiaozhuti;
	}
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
