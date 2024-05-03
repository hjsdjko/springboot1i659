package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdangjianxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdangjianxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdangjianxuexiView;


/**
 * 党建学习评论表
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface DiscussdangjianxuexiService extends IService<DiscussdangjianxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdangjianxuexiVO> selectListVO(Wrapper<DiscussdangjianxuexiEntity> wrapper);
   	
   	DiscussdangjianxuexiVO selectVO(@Param("ew") Wrapper<DiscussdangjianxuexiEntity> wrapper);
   	
   	List<DiscussdangjianxuexiView> selectListView(Wrapper<DiscussdangjianxuexiEntity> wrapper);
   	
   	DiscussdangjianxuexiView selectView(@Param("ew") Wrapper<DiscussdangjianxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdangjianxuexiEntity> wrapper);
   	

}

