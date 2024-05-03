package com.dao;

import com.entity.WenjuanhuidaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuanhuidaVO;
import com.entity.view.WenjuanhuidaView;


/**
 * 问卷回答
 * 
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface WenjuanhuidaDao extends BaseMapper<WenjuanhuidaEntity> {
	
	List<WenjuanhuidaVO> selectListVO(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	
	WenjuanhuidaVO selectVO(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	
	List<WenjuanhuidaView> selectListView(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);

	List<WenjuanhuidaView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	
	WenjuanhuidaView selectView(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);


    List<Map<String, Object>> wenjuanbiaotiwenjuanhuidaTypeStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);

}
