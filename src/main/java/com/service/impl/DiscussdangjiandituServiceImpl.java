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


import com.dao.DiscussdangjiandituDao;
import com.entity.DiscussdangjiandituEntity;
import com.service.DiscussdangjiandituService;
import com.entity.vo.DiscussdangjiandituVO;
import com.entity.view.DiscussdangjiandituView;

@Service("discussdangjiandituService")
public class DiscussdangjiandituServiceImpl extends ServiceImpl<DiscussdangjiandituDao, DiscussdangjiandituEntity> implements DiscussdangjiandituService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangjiandituEntity> page = this.selectPage(
                new Query<DiscussdangjiandituEntity>(params).getPage(),
                new EntityWrapper<DiscussdangjiandituEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangjiandituEntity> wrapper) {
		  Page<DiscussdangjiandituView> page =new Query<DiscussdangjiandituView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdangjiandituVO> selectListVO(Wrapper<DiscussdangjiandituEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangjiandituVO selectVO(Wrapper<DiscussdangjiandituEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangjiandituView> selectListView(Wrapper<DiscussdangjiandituEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangjiandituView selectView(Wrapper<DiscussdangjiandituEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
