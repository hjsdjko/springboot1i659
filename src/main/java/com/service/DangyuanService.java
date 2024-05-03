package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanView;


/**
 * 党员
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangyuanService extends IService<DangyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanVO> selectListVO(Wrapper<DangyuanEntity> wrapper);
   	
   	DangyuanVO selectVO(@Param("ew") Wrapper<DangyuanEntity> wrapper);
   	
   	List<DangyuanView> selectListView(Wrapper<DangyuanEntity> wrapper);
   	
   	DangyuanView selectView(@Param("ew") Wrapper<DangyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DangyuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DangyuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DangyuanEntity> wrapper);

    List<Map<String, Object>> nianlingSectionStat(Map<String, Object> params,Wrapper<DangyuanEntity> wrapper);


}

