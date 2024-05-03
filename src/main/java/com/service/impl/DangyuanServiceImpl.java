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


import com.dao.DangyuanDao;
import com.entity.DangyuanEntity;
import com.service.DangyuanService;
import com.entity.vo.DangyuanVO;
import com.entity.view.DangyuanView;

@Service("dangyuanService")
public class DangyuanServiceImpl extends ServiceImpl<DangyuanDao, DangyuanEntity> implements DangyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanEntity> page = this.selectPage(
                new Query<DangyuanEntity>(params).getPage(),
                new EntityWrapper<DangyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanEntity> wrapper) {
		  Page<DangyuanView> page =new Query<DangyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanVO> selectListVO(Wrapper<DangyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanVO selectVO(Wrapper<DangyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanView> selectListView(Wrapper<DangyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanView selectView(Wrapper<DangyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DangyuanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DangyuanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DangyuanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> nianlingSectionStat(Map<String, Object> params, Wrapper<DangyuanEntity> wrapper) {
        return baseMapper.nianlingSectionStat(params, wrapper);
    }



}
