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


import com.dao.DiscussdangjianxuexiDao;
import com.entity.DiscussdangjianxuexiEntity;
import com.service.DiscussdangjianxuexiService;
import com.entity.vo.DiscussdangjianxuexiVO;
import com.entity.view.DiscussdangjianxuexiView;

@Service("discussdangjianxuexiService")
public class DiscussdangjianxuexiServiceImpl extends ServiceImpl<DiscussdangjianxuexiDao, DiscussdangjianxuexiEntity> implements DiscussdangjianxuexiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangjianxuexiEntity> page = this.selectPage(
                new Query<DiscussdangjianxuexiEntity>(params).getPage(),
                new EntityWrapper<DiscussdangjianxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangjianxuexiEntity> wrapper) {
		  Page<DiscussdangjianxuexiView> page =new Query<DiscussdangjianxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdangjianxuexiVO> selectListVO(Wrapper<DiscussdangjianxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangjianxuexiVO selectVO(Wrapper<DiscussdangjianxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangjianxuexiView> selectListView(Wrapper<DiscussdangjianxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangjianxuexiView selectView(Wrapper<DiscussdangjianxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
