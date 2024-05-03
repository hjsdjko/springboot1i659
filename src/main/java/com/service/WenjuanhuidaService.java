package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjuanhuidaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjuanhuidaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjuanhuidaView;


/**
 * 问卷回答
 *
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
public interface WenjuanhuidaService extends IService<WenjuanhuidaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjuanhuidaVO> selectListVO(Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	WenjuanhuidaVO selectVO(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	List<WenjuanhuidaView> selectListView(Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	WenjuanhuidaView selectView(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjuanhuidaEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WenjuanhuidaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WenjuanhuidaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WenjuanhuidaEntity> wrapper);


    List<Map<String, Object>> wenjuanbiaotiwenjuanhuidaTypeStat(Map<String, Object> params,Wrapper<WenjuanhuidaEntity> wrapper);

}

