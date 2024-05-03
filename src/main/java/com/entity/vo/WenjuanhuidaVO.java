package com.entity.vo;

import com.entity.WenjuanhuidaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 问卷回答
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public class WenjuanhuidaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 问卷回答
	 */
	
	private String wenjuanhuida;
		
	/**
	 * 调查时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date diaochashijian;
		
	/**
	 * 党员账号
	 */
	
	private String dangyuanzhanghao;
		
	/**
	 * 党员姓名
	 */
	
	private String dangyuanxingming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：问卷回答
	 */
	 
	public void setWenjuanhuida(String wenjuanhuida) {
		this.wenjuanhuida = wenjuanhuida;
	}
	
	/**
	 * 获取：问卷回答
	 */
	public String getWenjuanhuida() {
		return wenjuanhuida;
	}
				
	
	/**
	 * 设置：调查时间
	 */
	 
	public void setDiaochashijian(Date diaochashijian) {
		this.diaochashijian = diaochashijian;
	}
	
	/**
	 * 获取：调查时间
	 */
	public Date getDiaochashijian() {
		return diaochashijian;
	}
				
	
	/**
	 * 设置：党员账号
	 */
	 
	public void setDangyuanzhanghao(String dangyuanzhanghao) {
		this.dangyuanzhanghao = dangyuanzhanghao;
	}
	
	/**
	 * 获取：党员账号
	 */
	public String getDangyuanzhanghao() {
		return dangyuanzhanghao;
	}
				
	
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
