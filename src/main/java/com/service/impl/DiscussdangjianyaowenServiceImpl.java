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


import com.dao.DiscussdangjianyaowenDao;
import com.entity.DiscussdangjianyaowenEntity;
import com.service.DiscussdangjianyaowenService;
import com.entity.vo.DiscussdangjianyaowenVO;
import com.entity.view.DiscussdangjianyaowenView;

@Service("discussdangjianyaowenService")
public class DiscussdangjianyaowenServiceImpl extends ServiceImpl<DiscussdangjianyaowenDao, DiscussdangjianyaowenEntity> implements DiscussdangjianyaowenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangjianyaowenEntity> page = this.selectPage(
                new Query<DiscussdangjianyaowenEntity>(params).getPage(),
                new EntityWrapper<DiscussdangjianyaowenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangjianyaowenEntity> wrapper) {
		  Page<DiscussdangjianyaowenView> page =new Query<DiscussdangjianyaowenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdangjianyaowenVO> selectListVO(Wrapper<DiscussdangjianyaowenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangjianyaowenVO selectVO(Wrapper<DiscussdangjianyaowenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangjianyaowenView> selectListView(Wrapper<DiscussdangjianyaowenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangjianyaowenView selectView(Wrapper<DiscussdangjianyaowenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
