package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangjiandituEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangjiandituVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangjiandituView;


/**
 * 党建地图
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjiandituService extends IService<DangjiandituEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangjiandituVO> selectListVO(Wrapper<DangjiandituEntity> wrapper);
   	
   	DangjiandituVO selectVO(@Param("ew") Wrapper<DangjiandituEntity> wrapper);
   	
   	List<DangjiandituView> selectListView(Wrapper<DangjiandituEntity> wrapper);
   	
   	DangjiandituView selectView(@Param("ew") Wrapper<DangjiandituEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangjiandituEntity> wrapper);
   	

}

