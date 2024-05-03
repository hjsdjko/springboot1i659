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


import com.dao.DangfeijiaonaDao;
import com.entity.DangfeijiaonaEntity;
import com.service.DangfeijiaonaService;
import com.entity.vo.DangfeijiaonaVO;
import com.entity.view.DangfeijiaonaView;

@Service("dangfeijiaonaService")
public class DangfeijiaonaServiceImpl extends ServiceImpl<DangfeijiaonaDao, DangfeijiaonaEntity> implements DangfeijiaonaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangfeijiaonaEntity> page = this.selectPage(
                new Query<DangfeijiaonaEntity>(params).getPage(),
                new EntityWrapper<DangfeijiaonaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangfeijiaonaEntity> wrapper) {
		  Page<DangfeijiaonaView> page =new Query<DangfeijiaonaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangfeijiaonaVO> selectListVO(Wrapper<DangfeijiaonaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangfeijiaonaVO selectVO(Wrapper<DangfeijiaonaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangfeijiaonaView> selectListView(Wrapper<DangfeijiaonaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangfeijiaonaView selectView(Wrapper<DangfeijiaonaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
