package com.entity.view;

import com.entity.MinzhutoupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 民主投票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
@TableName("minzhutoupiao")
public class MinzhutoupiaoView  extends MinzhutoupiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MinzhutoupiaoView(){
	}
 
 	public MinzhutoupiaoView(MinzhutoupiaoEntity minzhutoupiaoEntity){
 	try {
			BeanUtils.copyProperties(this, minzhutoupiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
