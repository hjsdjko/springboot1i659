package com.entity.view;

import com.entity.DiscussdangjianyaowenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党建要闻评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
@TableName("discussdangjianyaowen")
public class DiscussdangjianyaowenView  extends DiscussdangjianyaowenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdangjianyaowenView(){
	}
 
 	public DiscussdangjianyaowenView(DiscussdangjianyaowenEntity discussdangjianyaowenEntity){
 	try {
			BeanUtils.copyProperties(this, discussdangjianyaowenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
