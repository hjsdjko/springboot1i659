package com.entity.vo;

import com.entity.WenjuandiaochaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 问卷调查
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public class WenjuandiaochaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
