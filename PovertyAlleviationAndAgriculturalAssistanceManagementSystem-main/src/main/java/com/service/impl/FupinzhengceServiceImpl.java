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


import com.dao.FupinzhengceDao;
import com.entity.FupinzhengceEntity;
import com.service.FupinzhengceService;
import com.entity.vo.FupinzhengceVO;
import com.entity.view.FupinzhengceView;

@Service("fupinzhengceService")
public class FupinzhengceServiceImpl extends ServiceImpl<FupinzhengceDao, FupinzhengceEntity> implements FupinzhengceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FupinzhengceEntity> page = this.selectPage(
                new Query<FupinzhengceEntity>(params).getPage(),
                new EntityWrapper<FupinzhengceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FupinzhengceEntity> wrapper) {
		  Page<FupinzhengceView> page =new Query<FupinzhengceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FupinzhengceVO> selectListVO(Wrapper<FupinzhengceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FupinzhengceVO selectVO(Wrapper<FupinzhengceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FupinzhengceView> selectListView(Wrapper<FupinzhengceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FupinzhengceView selectView(Wrapper<FupinzhengceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
