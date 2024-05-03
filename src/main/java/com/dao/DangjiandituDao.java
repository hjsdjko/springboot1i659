package com.dao;

import com.entity.DangjiandituEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangjiandituVO;
import com.entity.view.DangjiandituView;


/**
 * 党建地图
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjiandituDao extends BaseMapper<DangjiandituEntity> {
	
	List<DangjiandituVO> selectListVO(@Param("ew") Wrapper<DangjiandituEntity> wrapper);
	
	DangjiandituVO selectVO(@Param("ew") Wrapper<DangjiandituEntity> wrapper);
	
	List<DangjiandituView> selectListView(@Param("ew") Wrapper<DangjiandituEntity> wrapper);

	List<DangjiandituView> selectListView(Pagination page,@Param("ew") Wrapper<DangjiandituEntity> wrapper);
	
	DangjiandituView selectView(@Param("ew") Wrapper<DangjiandituEntity> wrapper);
	

}
