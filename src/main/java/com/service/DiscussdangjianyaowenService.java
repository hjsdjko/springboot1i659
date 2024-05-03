package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdangjianyaowenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdangjianyaowenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdangjianyaowenView;


/**
 * 党建要闻评论表
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface DiscussdangjianyaowenService extends IService<DiscussdangjianyaowenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdangjianyaowenVO> selectListVO(Wrapper<DiscussdangjianyaowenEntity> wrapper);
   	
   	DiscussdangjianyaowenVO selectVO(@Param("ew") Wrapper<DiscussdangjianyaowenEntity> wrapper);
   	
   	List<DiscussdangjianyaowenView> selectListView(Wrapper<DiscussdangjianyaowenEntity> wrapper);
   	
   	DiscussdangjianyaowenView selectView(@Param("ew") Wrapper<DiscussdangjianyaowenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdangjianyaowenEntity> wrapper);
   	

}

