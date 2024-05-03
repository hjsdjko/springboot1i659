package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdangjiandituEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdangjiandituVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdangjiandituView;


/**
 * 党建地图评论表
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface DiscussdangjiandituService extends IService<DiscussdangjiandituEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdangjiandituVO> selectListVO(Wrapper<DiscussdangjiandituEntity> wrapper);
   	
   	DiscussdangjiandituVO selectVO(@Param("ew") Wrapper<DiscussdangjiandituEntity> wrapper);
   	
   	List<DiscussdangjiandituView> selectListView(Wrapper<DiscussdangjiandituEntity> wrapper);
   	
   	DiscussdangjiandituView selectView(@Param("ew") Wrapper<DiscussdangjiandituEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdangjiandituEntity> wrapper);
   	

}

