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

import com.entity.DianpuEntity;
import com.entity.view.DianpuView;

import com.service.DianpuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 店铺
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@RestController
@RequestMapping("/dianpu")
public class DianpuController {
    @Autowired
    private DianpuService dianpuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DianpuEntity dianpu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dianjia")) {
			dianpu.setDianjiaming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DianpuEntity> ew = new EntityWrapper<DianpuEntity>();
		PageUtils page = dianpuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianpu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DianpuEntity dianpu, HttpServletRequest request){
        EntityWrapper<DianpuEntity> ew = new EntityWrapper<DianpuEntity>();
		PageUtils page = dianpuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianpu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DianpuEntity dianpu){
       	EntityWrapper<DianpuEntity> ew = new EntityWrapper<DianpuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dianpu, "dianpu")); 
        return R.ok().put("data", dianpuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DianpuEntity dianpu){
        EntityWrapper< DianpuEntity> ew = new EntityWrapper< DianpuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dianpu, "dianpu")); 
		DianpuView dianpuView =  dianpuService.selectView(ew);
		return R.ok("查询店铺成功").put("data", dianpuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DianpuEntity dianpu = dianpuService.selectById(id);
        return R.ok().put("data", dianpu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DianpuEntity dianpu = dianpuService.selectById(id);
        return R.ok().put("data", dianpu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        DianpuEntity dianpu = dianpuService.selectById(id);
        if(type.equals("1")) {
        	dianpu.setThumbsupnum(dianpu.getThumbsupnum()+1);
        } else {
        	dianpu.setCrazilynum(dianpu.getCrazilynum()+1);
        }
        dianpuService.updateById(dianpu);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DianpuEntity dianpu, HttpServletRequest request){
    	dianpu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianpu);
        dianpuService.insert(dianpu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DianpuEntity dianpu, HttpServletRequest request){
    	dianpu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianpu);
        dianpuService.insert(dianpu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DianpuEntity dianpu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dianpu);
        dianpuService.updateById(dianpu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dianpuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DianpuEntity> wrapper = new EntityWrapper<DianpuEntity>();
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

		int count = dianpuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
