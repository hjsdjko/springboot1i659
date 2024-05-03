package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangjianxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangjianxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangjianxuexiView;


/**
 * 党建学习
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjianxuexiService extends IService<DangjianxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangjianxuexiVO> selectListVO(Wrapper<DangjianxuexiEntity> wrapper);
   	
   	DangjianxuexiVO selectVO(@Param("ew") Wrapper<DangjianxuexiEntity> wrapper);
   	
   	List<DangjianxuexiView> selectListView(Wrapper<DangjianxuexiEntity> wrapper);
   	
   	DangjianxuexiView selectView(@Param("ew") Wrapper<DangjianxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangjianxuexiEntity> wrapper);
   	

}

