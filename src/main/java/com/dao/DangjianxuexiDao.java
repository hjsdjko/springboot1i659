package com.dao;

import com.entity.DangjianxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangjianxuexiVO;
import com.entity.view.DangjianxuexiView;


/**
 * 党建学习
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjianxuexiDao extends BaseMapper<DangjianxuexiEntity> {
	
	List<DangjianxuexiVO> selectListVO(@Param("ew") Wrapper<DangjianxuexiEntity> wrapper);
	
	DangjianxuexiVO selectVO(@Param("ew") Wrapper<DangjianxuexiEntity> wrapper);
	
	List<DangjianxuexiView> selectListView(@Param("ew") Wrapper<DangjianxuexiEntity> wrapper);

	List<DangjianxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<DangjianxuexiEntity> wrapper);
	
	DangjianxuexiView selectView(@Param("ew") Wrapper<DangjianxuexiEntity> wrapper);
	

}
