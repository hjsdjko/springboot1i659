package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ExampaperEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ExampaperVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ExampaperView;


/**
 * 学习测试表
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface ExampaperService extends IService<ExampaperEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ExampaperVO> selectListVO(Wrapper<ExampaperEntity> wrapper);
   	
   	ExampaperVO selectVO(@Param("ew") Wrapper<ExampaperEntity> wrapper);
   	
   	List<ExampaperView> selectListView(Wrapper<ExampaperEntity> wrapper);
   	
   	ExampaperView selectView(@Param("ew") Wrapper<ExampaperEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ExampaperEntity> wrapper);
   	

}

