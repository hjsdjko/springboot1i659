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


import com.dao.DangjianyaowenDao;
import com.entity.DangjianyaowenEntity;
import com.service.DangjianyaowenService;
import com.entity.vo.DangjianyaowenVO;
import com.entity.view.DangjianyaowenView;

@Service("dangjianyaowenService")
public class DangjianyaowenServiceImpl extends ServiceImpl<DangjianyaowenDao, DangjianyaowenEntity> implements DangjianyaowenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangjianyaowenEntity> page = this.selectPage(
                new Query<DangjianyaowenEntity>(params).getPage(),
                new EntityWrapper<DangjianyaowenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangjianyaowenEntity> wrapper) {
		  Page<DangjianyaowenView> page =new Query<DangjianyaowenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangjianyaowenVO> selectListVO(Wrapper<DangjianyaowenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangjianyaowenVO selectVO(Wrapper<DangjianyaowenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangjianyaowenView> selectListView(Wrapper<DangjianyaowenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangjianyaowenView selectView(Wrapper<DangjianyaowenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
