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
 * 问卷调查
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
@TableName("wenjuandiaocha")
public class WenjuandiaochaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenjuandiaochaEntity() {
		
	}
	
	public WenjuandiaochaEntity(T t) {
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
	 * 问卷标题
	 */
					
	private String wenjuanbiaoti;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 问卷内容
	 */
					
	private String wenjuanneirong;
	
	/**
	 * 答案一
	 */
					
	private String daanyi;
	
	/**
	 * 答案二
	 */
					
	private String daaner;
	
	/**
	 * 答案三
	 */
					
	private String daansan;
	
	/**
	 * 答案四
	 */
					
	private String daansi;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：问卷标题
	 */
	public void setWenjuanbiaoti(String wenjuanbiaoti) {
		this.wenjuanbiaoti = wenjuanbiaoti;
	}
	/**
	 * 获取：问卷标题
	 */
	public String getWenjuanbiaoti() {
		return wenjuanbiaoti;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：问卷内容
	 */
	public void setWenjuanneirong(String wenjuanneirong) {
		this.wenjuanneirong = wenjuanneirong;
	}
	/**
	 * 获取：问卷内容
	 */
	public String getWenjuanneirong() {
		return wenjuanneirong;
	}
	/**
	 * 设置：答案一
	 */
	public void setDaanyi(String daanyi) {
		this.daanyi = daanyi;
	}
	/**
	 * 获取：答案一
	 */
	public String getDaanyi() {
		return daanyi;
	}
	/**
	 * 设置：答案二
	 */
	public void setDaaner(String daaner) {
		this.daaner = daaner;
	}
	/**
	 * 获取：答案二
	 */
	public String getDaaner() {
		return daaner;
	}
	/**
	 * 设置：答案三
	 */
	public void setDaansan(String daansan) {
		this.daansan = daansan;
	}
	/**
	 * 获取：答案三
	 */
	public String getDaansan() {
		return daansan;
	}
	/**
	 * 设置：答案四
	 */
	public void setDaansi(String daansi) {
		this.daansi = daansi;
	}
	/**
	 * 获取：答案四
	 */
	public String getDaansi() {
		return daansi;
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

}
