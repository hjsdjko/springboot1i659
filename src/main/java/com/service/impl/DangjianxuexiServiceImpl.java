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


import com.dao.DangjianxuexiDao;
import com.entity.DangjianxuexiEntity;
import com.service.DangjianxuexiService;
import com.entity.vo.DangjianxuexiVO;
import com.entity.view.DangjianxuexiView;

@Service("dangjianxuexiService")
public class DangjianxuexiServiceImpl extends ServiceImpl<DangjianxuexiDao, DangjianxuexiEntity> implements DangjianxuexiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangjianxuexiEntity> page = this.selectPage(
                new Query<DangjianxuexiEntity>(params).getPage(),
                new EntityWrapper<DangjianxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangjianxuexiEntity> wrapper) {
		  Page<DangjianxuexiView> page =new Query<DangjianxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangjianxuexiVO> selectListVO(Wrapper<DangjianxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangjianxuexiVO selectVO(Wrapper<DangjianxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangjianxuexiView> selectListView(Wrapper<DangjianxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangjianxuexiView selectView(Wrapper<DangjianxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
