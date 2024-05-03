package com.dao;

import com.entity.DangjianyaowenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangjianyaowenVO;
import com.entity.view.DangjianyaowenView;


/**
 * 党建要闻
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangjianyaowenDao extends BaseMapper<DangjianyaowenEntity> {
	
	List<DangjianyaowenVO> selectListVO(@Param("ew") Wrapper<DangjianyaowenEntity> wrapper);
	
	DangjianyaowenVO selectVO(@Param("ew") Wrapper<DangjianyaowenEntity> wrapper);
	
	List<DangjianyaowenView> selectListView(@Param("ew") Wrapper<DangjianyaowenEntity> wrapper);

	List<DangjianyaowenView> selectListView(Pagination page,@Param("ew") Wrapper<DangjianyaowenEntity> wrapper);
	
	DangjianyaowenView selectView(@Param("ew") Wrapper<DangjianyaowenEntity> wrapper);
	

}
