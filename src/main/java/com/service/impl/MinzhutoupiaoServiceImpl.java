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


import com.dao.MinzhutoupiaoDao;
import com.entity.MinzhutoupiaoEntity;
import com.service.MinzhutoupiaoService;
import com.entity.vo.MinzhutoupiaoVO;
import com.entity.view.MinzhutoupiaoView;

@Service("minzhutoupiaoService")
public class MinzhutoupiaoServiceImpl extends ServiceImpl<MinzhutoupiaoDao, MinzhutoupiaoEntity> implements MinzhutoupiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MinzhutoupiaoEntity> page = this.selectPage(
                new Query<MinzhutoupiaoEntity>(params).getPage(),
                new EntityWrapper<MinzhutoupiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MinzhutoupiaoEntity> wrapper) {
		  Page<MinzhutoupiaoView> page =new Query<MinzhutoupiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MinzhutoupiaoVO> selectListVO(Wrapper<MinzhutoupiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MinzhutoupiaoVO selectVO(Wrapper<MinzhutoupiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MinzhutoupiaoView> selectListView(Wrapper<MinzhutoupiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MinzhutoupiaoView selectView(Wrapper<MinzhutoupiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
