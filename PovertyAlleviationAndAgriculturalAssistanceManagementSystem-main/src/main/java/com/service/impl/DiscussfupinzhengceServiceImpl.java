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


import com.dao.DiscussfupinzhengceDao;
import com.entity.DiscussfupinzhengceEntity;
import com.service.DiscussfupinzhengceService;
import com.entity.vo.DiscussfupinzhengceVO;
import com.entity.view.DiscussfupinzhengceView;

@Service("discussfupinzhengceService")
public class DiscussfupinzhengceServiceImpl extends ServiceImpl<DiscussfupinzhengceDao, DiscussfupinzhengceEntity> implements DiscussfupinzhengceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfupinzhengceEntity> page = this.selectPage(
                new Query<DiscussfupinzhengceEntity>(params).getPage(),
                new EntityWrapper<DiscussfupinzhengceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfupinzhengceEntity> wrapper) {
		  Page<DiscussfupinzhengceView> page =new Query<DiscussfupinzhengceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfupinzhengceVO> selectListVO(Wrapper<DiscussfupinzhengceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfupinzhengceVO selectVO(Wrapper<DiscussfupinzhengceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfupinzhengceView> selectListView(Wrapper<DiscussfupinzhengceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfupinzhengceView selectView(Wrapper<DiscussfupinzhengceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
