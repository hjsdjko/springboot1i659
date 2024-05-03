package com.dao;

import com.entity.DangjianhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangjianhuodongVO;
import com.entity.view.DangjianhuodongView;


/**
 * 党建活动
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjianhuodongDao extends BaseMapper<DangjianhuodongEntity> {
	
	List<DangjianhuodongVO> selectListVO(@Param("ew") Wrapper<DangjianhuodongEntity> wrapper);
	
	DangjianhuodongVO selectVO(@Param("ew") Wrapper<DangjianhuodongEntity> wrapper);
	
	List<DangjianhuodongView> selectListView(@Param("ew") Wrapper<DangjianhuodongEntity> wrapper);

	List<DangjianhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DangjianhuodongEntity> wrapper);
	
	DangjianhuodongView selectView(@Param("ew") Wrapper<DangjianhuodongEntity> wrapper);
	

}
