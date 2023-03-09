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


import com.dao.TuihuoshenqingDao;
import com.entity.TuihuoshenqingEntity;
import com.service.TuihuoshenqingService;
import com.entity.vo.TuihuoshenqingVO;
import com.entity.view.TuihuoshenqingView;

@Service("tuihuoshenqingService")
public class TuihuoshenqingServiceImpl extends ServiceImpl<TuihuoshenqingDao, TuihuoshenqingEntity> implements TuihuoshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuihuoshenqingEntity> page = this.selectPage(
                new Query<TuihuoshenqingEntity>(params).getPage(),
                new EntityWrapper<TuihuoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuihuoshenqingEntity> wrapper) {
		  Page<TuihuoshenqingView> page =new Query<TuihuoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuihuoshenqingVO> selectListVO(Wrapper<TuihuoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuihuoshenqingVO selectVO(Wrapper<TuihuoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuihuoshenqingView> selectListView(Wrapper<TuihuoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuihuoshenqingView selectView(Wrapper<TuihuoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
