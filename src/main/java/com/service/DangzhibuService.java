package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangzhibuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangzhibuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangzhibuView;


/**
 * 党支部
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangzhibuService extends IService<DangzhibuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangzhibuVO> selectListVO(Wrapper<DangzhibuEntity> wrapper);
   	
   	DangzhibuVO selectVO(@Param("ew") Wrapper<DangzhibuEntity> wrapper);
   	
   	List<DangzhibuView> selectListView(Wrapper<DangzhibuEntity> wrapper);
   	
   	DangzhibuView selectView(@Param("ew") Wrapper<DangzhibuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangzhibuEntity> wrapper);
   	

}

