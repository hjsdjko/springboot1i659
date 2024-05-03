package com.entity.view;

import com.entity.DangyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
@TableName("dangyuan")
public class DangyuanView  extends DangyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangyuanView(){
	}
 
 	public DangyuanView(DangyuanEntity dangyuanEntity){
 	try {
			BeanUtils.copyProperties(this, dangyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
