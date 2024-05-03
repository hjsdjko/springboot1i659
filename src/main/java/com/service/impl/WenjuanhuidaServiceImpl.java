package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WenjuanhuidaDao;
import com.entity.WenjuanhuidaEntity;
import com.service.WenjuanhuidaService;
import com.entity.vo.WenjuanhuidaVO;
import com.entity.view.WenjuanhuidaView;

@Service("wenjuanhuidaService")
public class WenjuanhuidaServiceImpl extends ServiceImpl<WenjuanhuidaDao, WenjuanhuidaEntity> implements WenjuanhuidaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjuanhuidaEntity> page = this.selectPage(
                new Query<WenjuanhuidaEntity>(params).getPage(),
                new EntityWrapper<WenjuanhuidaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjuanhuidaEntity> wrapper) {
		  Page<WenjuanhuidaView> page =new Query<WenjuanhuidaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjuanhuidaVO> selectListVO(Wrapper<WenjuanhuidaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjuanhuidaVO selectVO(Wrapper<WenjuanhuidaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjuanhuidaView> selectListView(Wrapper<WenjuanhuidaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjuanhuidaView selectView(Wrapper<WenjuanhuidaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WenjuanhuidaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WenjuanhuidaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WenjuanhuidaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }


    @Override
    public List<Map<String, Object>> wenjuanbiaotiwenjuanhuidaTypeStat(Map<String, Object> params, Wrapper<WenjuanhuidaEntity> wrapper) {
        return baseMapper.wenjuanbiaotiwenjuanhuidaTypeStat(params, wrapper);
    }


}
