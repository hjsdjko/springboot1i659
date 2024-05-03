package com.dao;

import com.entity.DiscussdangjianyaowenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangjianyaowenVO;
import com.entity.view.DiscussdangjianyaowenView;


/**
 * 党建要闻评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface DiscussdangjianyaowenDao extends BaseMapper<DiscussdangjianyaowenEntity> {
	
	List<DiscussdangjianyaowenVO> selectListVO(@Param("ew") Wrapper<DiscussdangjianyaowenEntity> wrapper);
	
	DiscussdangjianyaowenVO selectVO(@Param("ew") Wrapper<DiscussdangjianyaowenEntity> wrapper);
	
	List<DiscussdangjianyaowenView> selectListView(@Param("ew") Wrapper<DiscussdangjianyaowenEntity> wrapper);

	List<DiscussdangjianyaowenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangjianyaowenEntity> wrapper);
	
	DiscussdangjianyaowenView selectView(@Param("ew") Wrapper<DiscussdangjianyaowenEntity> wrapper);
	

}
