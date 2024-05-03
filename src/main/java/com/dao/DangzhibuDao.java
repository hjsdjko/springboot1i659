package com.dao;

import com.entity.DangzhibuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangzhibuVO;
import com.entity.view.DangzhibuView;


/**
 * 党支部
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:07
 */
public interface DangzhibuDao extends BaseMapper<DangzhibuEntity> {
	
	List<DangzhibuVO> selectListVO(@Param("ew") Wrapper<DangzhibuEntity> wrapper);
	
	DangzhibuVO selectVO(@Param("ew") Wrapper<DangzhibuEntity> wrapper);
	
	List<DangzhibuView> selectListView(@Param("ew") Wrapper<DangzhibuEntity> wrapper);

	List<DangzhibuView> selectListView(Pagination page,@Param("ew") Wrapper<DangzhibuEntity> wrapper);
	
	DangzhibuView selectView(@Param("ew") Wrapper<DangzhibuEntity> wrapper);
	

}
