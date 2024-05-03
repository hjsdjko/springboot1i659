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


import com.dao.DangzhibuDao;
import com.entity.DangzhibuEntity;
import com.service.DangzhibuService;
import com.entity.vo.DangzhibuVO;
import com.entity.view.DangzhibuView;

@Service("dangzhibuService")
public class DangzhibuServiceImpl extends ServiceImpl<DangzhibuDao, DangzhibuEntity> implements DangzhibuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangzhibuEntity> page = this.selectPage(
                new Query<DangzhibuEntity>(params).getPage(),
                new EntityWrapper<DangzhibuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangzhibuEntity> wrapper) {
		  Page<DangzhibuView> page =new Query<DangzhibuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangzhibuVO> selectListVO(Wrapper<DangzhibuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangzhibuVO selectVO(Wrapper<DangzhibuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangzhibuView> selectListView(Wrapper<DangzhibuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangzhibuView selectView(Wrapper<DangzhibuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
