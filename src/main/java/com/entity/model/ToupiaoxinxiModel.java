package com.entity.model;

import com.entity.ToupiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 投票信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public class ToupiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 党员姓名
	 */
	
	private String dangyuanxingming;
		
	/**
	 * 投票主题
	 */
	
	private String toupiaozhuti;
		
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
	 * 投票时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date toupiaoshijian;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：党员姓名
	 */
	 
	public void setDangyuanxingming(String dangyuanxingming) {
		this.dangyuanxingming = dangyuanxingming;
	}
	
	/**
	 * 获取：党员姓名
	 */
	public String getDangyuanxingming() {
		return dangyuanxingming;
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
	 * 设置：投票时间
	 */
	 
	public void setToupiaoshijian(Date toupiaoshijian) {
		this.toupiaoshijian = toupiaoshijian;
	}
	
	/**
	 * 获取：投票时间
	 */
	public Date getToupiaoshijian() {
		return toupiaoshijian;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
