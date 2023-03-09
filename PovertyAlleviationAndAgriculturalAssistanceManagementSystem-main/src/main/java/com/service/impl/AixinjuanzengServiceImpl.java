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


import com.dao.AixinjuanzengDao;
import com.entity.AixinjuanzengEntity;
import com.service.AixinjuanzengService;
import com.entity.vo.AixinjuanzengVO;
import com.entity.view.AixinjuanzengView;

@Service("aixinjuanzengService")
public class AixinjuanzengServiceImpl extends ServiceImpl<AixinjuanzengDao, AixinjuanzengEntity> implements AixinjuanzengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AixinjuanzengEntity> page = this.selectPage(
                new Query<AixinjuanzengEntity>(params).getPage(),
                new EntityWrapper<AixinjuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AixinjuanzengEntity> wrapper) {
		  Page<AixinjuanzengView> page =new Query<AixinjuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AixinjuanzengVO> selectListVO(Wrapper<AixinjuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AixinjuanzengVO selectVO(Wrapper<AixinjuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AixinjuanzengView> selectListView(Wrapper<AixinjuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AixinjuanzengView selectView(Wrapper<AixinjuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
