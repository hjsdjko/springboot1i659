package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangfeijiaonaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangfeijiaonaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangfeijiaonaView;


/**
 * 党费缴纳
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangfeijiaonaService extends IService<DangfeijiaonaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangfeijiaonaVO> selectListVO(Wrapper<DangfeijiaonaEntity> wrapper);
   	
   	DangfeijiaonaVO selectVO(@Param("ew") Wrapper<DangfeijiaonaEntity> wrapper);
   	
   	List<DangfeijiaonaView> selectListView(Wrapper<DangfeijiaonaEntity> wrapper);
   	
   	DangfeijiaonaView selectView(@Param("ew") Wrapper<DangfeijiaonaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangfeijiaonaEntity> wrapper);
   	

}

