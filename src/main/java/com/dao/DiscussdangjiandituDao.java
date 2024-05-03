package com.dao;

import com.entity.DiscussdangjiandituEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangjiandituVO;
import com.entity.view.DiscussdangjiandituView;


/**
 * 党建地图评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface DiscussdangjiandituDao extends BaseMapper<DiscussdangjiandituEntity> {
	
	List<DiscussdangjiandituVO> selectListVO(@Param("ew") Wrapper<DiscussdangjiandituEntity> wrapper);
	
	DiscussdangjiandituVO selectVO(@Param("ew") Wrapper<DiscussdangjiandituEntity> wrapper);
	
	List<DiscussdangjiandituView> selectListView(@Param("ew") Wrapper<DiscussdangjiandituEntity> wrapper);

	List<DiscussdangjiandituView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangjiandituEntity> wrapper);
	
	DiscussdangjiandituView selectView(@Param("ew") Wrapper<DiscussdangjiandituEntity> wrapper);
	

}
