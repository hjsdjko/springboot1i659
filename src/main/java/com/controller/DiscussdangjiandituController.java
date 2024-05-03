package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussdangjiandituEntity;
import com.entity.view.DiscussdangjiandituView;

import com.service.DiscussdangjiandituService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 党建地图评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
@RestController
@RequestMapping("/discussdangjianditu")
public class DiscussdangjiandituController {
    @Autowired
    private DiscussdangjiandituService discussdangjiandituService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussdangjiandituEntity discussdangjianditu,
		HttpServletRequest request){
        EntityWrapper<DiscussdangjiandituEntity> ew = new EntityWrapper<DiscussdangjiandituEntity>();

		PageUtils page = discussdangjiandituService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussdangjianditu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussdangjiandituEntity discussdangjianditu, 
		HttpServletRequest request){
        EntityWrapper<DiscussdangjiandituEntity> ew = new EntityWrapper<DiscussdangjiandituEntity>();

		PageUtils page = discussdangjiandituService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussdangjianditu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussdangjiandituEntity discussdangjianditu){
       	EntityWrapper<DiscussdangjiandituEntity> ew = new EntityWrapper<DiscussdangjiandituEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussdangjianditu, "discussdangjianditu")); 
        return R.ok().put("data", discussdangjiandituService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussdangjiandituEntity discussdangjianditu){
        EntityWrapper< DiscussdangjiandituEntity> ew = new EntityWrapper< DiscussdangjiandituEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussdangjianditu, "discussdangjianditu")); 
		DiscussdangjiandituView discussdangjiandituView =  discussdangjiandituService.selectView(ew);
		return R.ok("查询党建地图评论表成功").put("data", discussdangjiandituView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussdangjiandituEntity discussdangjianditu = discussdangjiandituService.selectById(id);
        return R.ok().put("data", discussdangjianditu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussdangjiandituEntity discussdangjianditu = discussdangjiandituService.selectById(id);
        return R.ok().put("data", discussdangjianditu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussdangjiandituEntity discussdangjianditu, HttpServletRequest request){
    	discussdangjianditu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussdangjianditu);
        discussdangjiandituService.insert(discussdangjianditu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussdangjiandituEntity discussdangjianditu, HttpServletRequest request){
    	discussdangjianditu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussdangjianditu);
        discussdangjiandituService.insert(discussdangjianditu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussdangjiandituEntity discussdangjianditu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussdangjianditu);
        discussdangjiandituService.updateById(discussdangjianditu);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussdangjiandituService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussdangjiandituEntity> wrapper = new EntityWrapper<DiscussdangjiandituEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussdangjiandituService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
