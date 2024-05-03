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


import com.dao.DangjianhuodongDao;
import com.entity.DangjianhuodongEntity;
import com.service.DangjianhuodongService;
import com.entity.vo.DangjianhuodongVO;
import com.entity.view.DangjianhuodongView;

@Service("dangjianhuodongService")
public class DangjianhuodongServiceImpl extends ServiceImpl<DangjianhuodongDao, DangjianhuodongEntity> implements DangjianhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangjianhuodongEntity> page = this.selectPage(
                new Query<DangjianhuodongEntity>(params).getPage(),
                new EntityWrapper<DangjianhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangjianhuodongEntity> wrapper) {
		  Page<DangjianhuodongView> page =new Query<DangjianhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangjianhuodongVO> selectListVO(Wrapper<DangjianhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangjianhuodongVO selectVO(Wrapper<DangjianhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangjianhuodongView> selectListView(Wrapper<DangjianhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangjianhuodongView selectView(Wrapper<DangjianhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
