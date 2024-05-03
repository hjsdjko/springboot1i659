package com.dao;

import com.entity.XuexixindeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexixindeVO;
import com.entity.view.XuexixindeView;


/**
 * 学习心得
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface XuexixindeDao extends BaseMapper<XuexixindeEntity> {
	
	List<XuexixindeVO> selectListVO(@Param("ew") Wrapper<XuexixindeEntity> wrapper);
	
	XuexixindeVO selectVO(@Param("ew") Wrapper<XuexixindeEntity> wrapper);
	
	List<XuexixindeView> selectListView(@Param("ew") Wrapper<XuexixindeEntity> wrapper);

	List<XuexixindeView> selectListView(Pagination page,@Param("ew") Wrapper<XuexixindeEntity> wrapper);
	
	XuexixindeView selectView(@Param("ew") Wrapper<XuexixindeEntity> wrapper);
	

}
