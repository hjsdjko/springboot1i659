package com.dao;

import com.entity.MinzhutoupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MinzhutoupiaoVO;
import com.entity.view.MinzhutoupiaoView;


/**
 * 民主投票
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface MinzhutoupiaoDao extends BaseMapper<MinzhutoupiaoEntity> {
	
	List<MinzhutoupiaoVO> selectListVO(@Param("ew") Wrapper<MinzhutoupiaoEntity> wrapper);
	
	MinzhutoupiaoVO selectVO(@Param("ew") Wrapper<MinzhutoupiaoEntity> wrapper);
	
	List<MinzhutoupiaoView> selectListView(@Param("ew") Wrapper<MinzhutoupiaoEntity> wrapper);

	List<MinzhutoupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<MinzhutoupiaoEntity> wrapper);
	
	MinzhutoupiaoView selectView(@Param("ew") Wrapper<MinzhutoupiaoEntity> wrapper);
	

}
