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


import com.dao.PinkundianjiashenqingDao;
import com.entity.PinkundianjiashenqingEntity;
import com.service.PinkundianjiashenqingService;
import com.entity.vo.PinkundianjiashenqingVO;
import com.entity.view.PinkundianjiashenqingView;

@Service("pinkundianjiashenqingService")
public class PinkundianjiashenqingServiceImpl extends ServiceImpl<PinkundianjiashenqingDao, PinkundianjiashenqingEntity> implements PinkundianjiashenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinkundianjiashenqingEntity> page = this.selectPage(
                new Query<PinkundianjiashenqingEntity>(params).getPage(),
                new EntityWrapper<PinkundianjiashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinkundianjiashenqingEntity> wrapper) {
		  Page<PinkundianjiashenqingView> page =new Query<PinkundianjiashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinkundianjiashenqingVO> selectListVO(Wrapper<PinkundianjiashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinkundianjiashenqingVO selectVO(Wrapper<PinkundianjiashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinkundianjiashenqingView> selectListView(Wrapper<PinkundianjiashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinkundianjiashenqingView selectView(Wrapper<PinkundianjiashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
