package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexixindeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexixindeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexixindeView;


/**
 * 学习心得
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface XuexixindeService extends IService<XuexixindeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexixindeVO> selectListVO(Wrapper<XuexixindeEntity> wrapper);
   	
   	XuexixindeVO selectVO(@Param("ew") Wrapper<XuexixindeEntity> wrapper);
   	
   	List<XuexixindeView> selectListView(Wrapper<XuexixindeEntity> wrapper);
   	
   	XuexixindeView selectView(@Param("ew") Wrapper<XuexixindeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexixindeEntity> wrapper);
   	

}

