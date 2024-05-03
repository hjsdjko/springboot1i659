package com.entity.view;

import com.entity.DangzhibuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党支部
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
@TableName("dangzhibu")
public class DangzhibuView  extends DangzhibuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangzhibuView(){
	}
 
 	public DangzhibuView(DangzhibuEntity dangzhibuEntity){
 	try {
			BeanUtils.copyProperties(this, dangzhibuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
