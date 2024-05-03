package com.dao;

import com.entity.DiscussdangjianxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangjianxuexiVO;
import com.entity.view.DiscussdangjianxuexiView;


/**
 * 党建学习评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface DiscussdangjianxuexiDao extends BaseMapper<DiscussdangjianxuexiEntity> {
	
	List<DiscussdangjianxuexiVO> selectListVO(@Param("ew") Wrapper<DiscussdangjianxuexiEntity> wrapper);
	
	DiscussdangjianxuexiVO selectVO(@Param("ew") Wrapper<DiscussdangjianxuexiEntity> wrapper);
	
	List<DiscussdangjianxuexiView> selectListView(@Param("ew") Wrapper<DiscussdangjianxuexiEntity> wrapper);

	List<DiscussdangjianxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangjianxuexiEntity> wrapper);
	
	DiscussdangjianxuexiView selectView(@Param("ew") Wrapper<DiscussdangjianxuexiEntity> wrapper);
	

}
