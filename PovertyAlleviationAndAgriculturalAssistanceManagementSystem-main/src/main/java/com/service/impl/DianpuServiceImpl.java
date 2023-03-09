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


import com.dao.DianpuDao;
import com.entity.DianpuEntity;
import com.service.DianpuService;
import com.entity.vo.DianpuVO;
import com.entity.view.DianpuView;

@Service("dianpuService")
public class DianpuServiceImpl extends ServiceImpl<DianpuDao, DianpuEntity> implements DianpuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianpuEntity> page = this.selectPage(
                new Query<DianpuEntity>(params).getPage(),
                new EntityWrapper<DianpuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianpuEntity> wrapper) {
		  Page<DianpuView> page =new Query<DianpuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianpuVO> selectListVO(Wrapper<DianpuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianpuVO selectVO(Wrapper<DianpuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianpuView> selectListView(Wrapper<DianpuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianpuView selectView(Wrapper<DianpuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
