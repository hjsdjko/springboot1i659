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

import com.entity.WenjuanhuidaEntity;
import com.entity.view.WenjuanhuidaView;

import com.service.WenjuanhuidaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 问卷回答
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-08 22:48:08
 */
@RestController
@RequestMapping("/wenjuanhuida")
public class WenjuanhuidaController {
    @Autowired
    private WenjuanhuidaService wenjuanhuidaService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenjuanhuidaEntity wenjuanhuida,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dangyuan")) {
			wenjuanhuida.setDangyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WenjuanhuidaEntity> ew = new EntityWrapper<WenjuanhuidaEntity>();

		PageUtils page = wenjuanhuidaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenjuanhuida), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenjuanhuidaEntity wenjuanhuida, 
		HttpServletRequest request){
        EntityWrapper<WenjuanhuidaEntity> ew = new EntityWrapper<WenjuanhuidaEntity>();

		PageUtils page = wenjuanhuidaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenjuanhuida), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenjuanhuidaEntity wenjuanhuida){
       	EntityWrapper<WenjuanhuidaEntity> ew = new EntityWrapper<WenjuanhuidaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenjuanhuida, "wenjuanhuida")); 
        return R.ok().put("data", wenjuanhuidaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenjuanhuidaEntity wenjuanhuida){
        EntityWrapper< WenjuanhuidaEntity> ew = new EntityWrapper< WenjuanhuidaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenjuanhuida, "wenjuanhuida")); 
		WenjuanhuidaView wenjuanhuidaView =  wenjuanhuidaService.selectView(ew);
		return R.ok("查询问卷回答成功").put("data", wenjuanhuidaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenjuanhuidaEntity wenjuanhuida = wenjuanhuidaService.selectById(id);
        return R.ok().put("data", wenjuanhuida);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenjuanhuidaEntity wenjuanhuida = wenjuanhuidaService.selectById(id);
        return R.ok().put("data", wenjuanhuida);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenjuanhuidaEntity wenjuanhuida, HttpServletRequest request){
    	wenjuanhuida.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenjuanhuida);
        wenjuanhuidaService.insert(wenjuanhuida);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenjuanhuidaEntity wenjuanhuida, HttpServletRequest request){
    	wenjuanhuida.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenjuanhuida);
        wenjuanhuidaService.insert(wenjuanhuida);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenjuanhuidaEntity wenjuanhuida, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenjuanhuida);
        wenjuanhuidaService.updateById(wenjuanhuida);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenjuanhuidaService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WenjuanhuidaEntity> wrapper = new EntityWrapper<WenjuanhuidaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dangyuan")) {
			wrapper.eq("dangyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wenjuanhuidaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<WenjuanhuidaEntity> ew = new EntityWrapper<WenjuanhuidaEntity>();
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dangyuan")) {
            ew.eq("dangyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}
        List<Map<String, Object>> result = wenjuanhuidaService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<WenjuanhuidaEntity> ew = new EntityWrapper<WenjuanhuidaEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("dangyuan")) {
            ew.eq("dangyuanzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = wenjuanhuidaService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<WenjuanhuidaEntity> ew = new EntityWrapper<WenjuanhuidaEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("dangyuan")) {
            ew.eq("dangyuanzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = wenjuanhuidaService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }


    /**
     * 分组统计
     */
    @RequestMapping("/typeStat/wenjuanhuida/wenjuanbiaoti")
    @IgnoreAuth
    public R wenjuanbiaotiwenjuanhuidaTypeStat(HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        EntityWrapper<WenjuanhuidaEntity> ew = new EntityWrapper<WenjuanhuidaEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("dangyuan")) {
            ew.eq("dangyuanzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = wenjuanhuidaService.wenjuanbiaotiwenjuanhuidaTypeStat(params, ew);
        return R.ok().put("data", result);
    }




}
