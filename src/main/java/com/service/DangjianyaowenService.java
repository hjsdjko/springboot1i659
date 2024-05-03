package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangjianyaowenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangjianyaowenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangjianyaowenView;


/**
 * 党建要闻
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjianyaowenService extends IService<DangjianyaowenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangjianyaowenVO> selectListVO(Wrapper<DangjianyaowenEntity> wrapper);
   	
   	DangjianyaowenVO selectVO(@Param("ew") Wrapper<DangjianyaowenEntity> wrapper);
   	
   	List<DangjianyaowenView> selectListView(Wrapper<DangjianyaowenEntity> wrapper);
   	
   	DangjianyaowenView selectView(@Param("ew") Wrapper<DangjianyaowenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangjianyaowenEntity> wrapper);
   	

}

