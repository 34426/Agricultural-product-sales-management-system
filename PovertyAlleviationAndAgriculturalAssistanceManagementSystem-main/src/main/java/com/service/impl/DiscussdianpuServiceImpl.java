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


import com.dao.DiscussdianpuDao;
import com.entity.DiscussdianpuEntity;
import com.service.DiscussdianpuService;
import com.entity.vo.DiscussdianpuVO;
import com.entity.view.DiscussdianpuView;

@Service("discussdianpuService")
public class DiscussdianpuServiceImpl extends ServiceImpl<DiscussdianpuDao, DiscussdianpuEntity> implements DiscussdianpuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianpuEntity> page = this.selectPage(
                new Query<DiscussdianpuEntity>(params).getPage(),
                new EntityWrapper<DiscussdianpuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianpuEntity> wrapper) {
		  Page<DiscussdianpuView> page =new Query<DiscussdianpuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianpuVO> selectListVO(Wrapper<DiscussdianpuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianpuVO selectVO(Wrapper<DiscussdianpuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianpuView> selectListView(Wrapper<DiscussdianpuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianpuView selectView(Wrapper<DiscussdianpuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
