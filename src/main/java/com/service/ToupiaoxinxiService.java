package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ToupiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ToupiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ToupiaoxinxiView;


/**
 * 投票信息
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface ToupiaoxinxiService extends IService<ToupiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToupiaoxinxiVO> selectListVO(Wrapper<ToupiaoxinxiEntity> wrapper);
   	
   	ToupiaoxinxiVO selectVO(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
   	
   	List<ToupiaoxinxiView> selectListView(Wrapper<ToupiaoxinxiEntity> wrapper);
   	
   	ToupiaoxinxiView selectView(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToupiaoxinxiEntity> wrapper);
   	

}

