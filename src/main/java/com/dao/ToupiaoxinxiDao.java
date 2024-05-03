package com.dao;

import com.entity.ToupiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ToupiaoxinxiVO;
import com.entity.view.ToupiaoxinxiView;


/**
 * 投票信息
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface ToupiaoxinxiDao extends BaseMapper<ToupiaoxinxiEntity> {
	
	List<ToupiaoxinxiVO> selectListVO(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
	
	ToupiaoxinxiVO selectVO(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
	
	List<ToupiaoxinxiView> selectListView(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);

	List<ToupiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
	
	ToupiaoxinxiView selectView(@Param("ew") Wrapper<ToupiaoxinxiEntity> wrapper);
	

}
