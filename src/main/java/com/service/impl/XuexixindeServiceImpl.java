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


import com.dao.XuexixindeDao;
import com.entity.XuexixindeEntity;
import com.service.XuexixindeService;
import com.entity.vo.XuexixindeVO;
import com.entity.view.XuexixindeView;

@Service("xuexixindeService")
public class XuexixindeServiceImpl extends ServiceImpl<XuexixindeDao, XuexixindeEntity> implements XuexixindeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexixindeEntity> page = this.selectPage(
                new Query<XuexixindeEntity>(params).getPage(),
                new EntityWrapper<XuexixindeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexixindeEntity> wrapper) {
		  Page<XuexixindeView> page =new Query<XuexixindeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexixindeVO> selectListVO(Wrapper<XuexixindeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexixindeVO selectVO(Wrapper<XuexixindeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexixindeView> selectListView(Wrapper<XuexixindeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexixindeView selectView(Wrapper<XuexixindeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
