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


import com.dao.PinkundianjiaxinxiDao;
import com.entity.PinkundianjiaxinxiEntity;
import com.service.PinkundianjiaxinxiService;
import com.entity.vo.PinkundianjiaxinxiVO;
import com.entity.view.PinkundianjiaxinxiView;

@Service("pinkundianjiaxinxiService")
public class PinkundianjiaxinxiServiceImpl extends ServiceImpl<PinkundianjiaxinxiDao, PinkundianjiaxinxiEntity> implements PinkundianjiaxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinkundianjiaxinxiEntity> page = this.selectPage(
                new Query<PinkundianjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<PinkundianjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinkundianjiaxinxiEntity> wrapper) {
		  Page<PinkundianjiaxinxiView> page =new Query<PinkundianjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinkundianjiaxinxiVO> selectListVO(Wrapper<PinkundianjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinkundianjiaxinxiVO selectVO(Wrapper<PinkundianjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinkundianjiaxinxiView> selectListView(Wrapper<PinkundianjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinkundianjiaxinxiView selectView(Wrapper<PinkundianjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
