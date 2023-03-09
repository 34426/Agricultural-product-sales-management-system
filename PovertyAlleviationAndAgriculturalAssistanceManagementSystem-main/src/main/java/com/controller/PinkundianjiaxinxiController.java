package com.controller;

import java.text.SimpleDateFormat;
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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PinkundianjiaxinxiEntity;
import com.entity.view.PinkundianjiaxinxiView;

import com.service.PinkundianjiaxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 贫困店家信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@RestController
@RequestMapping("/pinkundianjiaxinxi")
public class PinkundianjiaxinxiController {
    @Autowired
    private PinkundianjiaxinxiService pinkundianjiaxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PinkundianjiaxinxiEntity pinkundianjiaxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dianjia")) {
			pinkundianjiaxinxi.setDianjiaming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PinkundianjiaxinxiEntity> ew = new EntityWrapper<PinkundianjiaxinxiEntity>();
		PageUtils page = pinkundianjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pinkundianjiaxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PinkundianjiaxinxiEntity pinkundianjiaxinxi, HttpServletRequest request){
        EntityWrapper<PinkundianjiaxinxiEntity> ew = new EntityWrapper<PinkundianjiaxinxiEntity>();
		PageUtils page = pinkundianjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pinkundianjiaxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PinkundianjiaxinxiEntity pinkundianjiaxinxi){
       	EntityWrapper<PinkundianjiaxinxiEntity> ew = new EntityWrapper<PinkundianjiaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( pinkundianjiaxinxi, "pinkundianjiaxinxi")); 
        return R.ok().put("data", pinkundianjiaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PinkundianjiaxinxiEntity pinkundianjiaxinxi){
        EntityWrapper< PinkundianjiaxinxiEntity> ew = new EntityWrapper< PinkundianjiaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( pinkundianjiaxinxi, "pinkundianjiaxinxi")); 
		PinkundianjiaxinxiView pinkundianjiaxinxiView =  pinkundianjiaxinxiService.selectView(ew);
		return R.ok("查询贫困店家信息成功").put("data", pinkundianjiaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PinkundianjiaxinxiEntity pinkundianjiaxinxi = pinkundianjiaxinxiService.selectById(id);
        return R.ok().put("data", pinkundianjiaxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PinkundianjiaxinxiEntity pinkundianjiaxinxi = pinkundianjiaxinxiService.selectById(id);
        return R.ok().put("data", pinkundianjiaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PinkundianjiaxinxiEntity pinkundianjiaxinxi, HttpServletRequest request){
    	pinkundianjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pinkundianjiaxinxi);
        pinkundianjiaxinxiService.insert(pinkundianjiaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PinkundianjiaxinxiEntity pinkundianjiaxinxi, HttpServletRequest request){
    	pinkundianjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pinkundianjiaxinxi);
        pinkundianjiaxinxiService.insert(pinkundianjiaxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PinkundianjiaxinxiEntity pinkundianjiaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(pinkundianjiaxinxi);
        pinkundianjiaxinxiService.updateById(pinkundianjiaxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pinkundianjiaxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<PinkundianjiaxinxiEntity> wrapper = new EntityWrapper<PinkundianjiaxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dianjia")) {
			wrapper.eq("dianjiaming", (String)request.getSession().getAttribute("username"));
		}

		int count = pinkundianjiaxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
