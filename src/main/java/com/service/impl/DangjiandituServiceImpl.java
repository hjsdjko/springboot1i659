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


import com.dao.DangjiandituDao;
import com.entity.DangjiandituEntity;
import com.service.DangjiandituService;
import com.entity.vo.DangjiandituVO;
import com.entity.view.DangjiandituView;

@Service("dangjiandituService")
public class DangjiandituServiceImpl extends ServiceImpl<DangjiandituDao, DangjiandituEntity> implements DangjiandituService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangjiandituEntity> page = this.selectPage(
                new Query<DangjiandituEntity>(params).getPage(),
                new EntityWrapper<DangjiandituEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangjiandituEntity> wrapper) {
		  Page<DangjiandituView> page =new Query<DangjiandituView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangjiandituVO> selectListVO(Wrapper<DangjiandituEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangjiandituVO selectVO(Wrapper<DangjiandituEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangjiandituView> selectListView(Wrapper<DangjiandituEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangjiandituView selectView(Wrapper<DangjiandituEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
