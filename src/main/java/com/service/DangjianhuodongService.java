package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangjianhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangjianhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangjianhuodongView;


/**
 * 党建活动
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjianhuodongService extends IService<DangjianhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangjianhuodongVO> selectListVO(Wrapper<DangjianhuodongEntity> wrapper);
   	
   	DangjianhuodongVO selectVO(@Param("ew") Wrapper<DangjianhuodongEntity> wrapper);
   	
   	List<DangjianhuodongView> selectListView(Wrapper<DangjianhuodongEntity> wrapper);
   	
   	DangjianhuodongView selectView(@Param("ew") Wrapper<DangjianhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangjianhuodongEntity> wrapper);
   	

}

