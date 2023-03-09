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


import com.dao.ShengchandifenleiDao;
import com.entity.ShengchandifenleiEntity;
import com.service.ShengchandifenleiService;
import com.entity.vo.ShengchandifenleiVO;
import com.entity.view.ShengchandifenleiView;

@Service("shengchandifenleiService")
public class ShengchandifenleiServiceImpl extends ServiceImpl<ShengchandifenleiDao, ShengchandifenleiEntity> implements ShengchandifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengchandifenleiEntity> page = this.selectPage(
                new Query<ShengchandifenleiEntity>(params).getPage(),
                new EntityWrapper<ShengchandifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengchandifenleiEntity> wrapper) {
		  Page<ShengchandifenleiView> page =new Query<ShengchandifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengchandifenleiVO> selectListVO(Wrapper<ShengchandifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengchandifenleiVO selectVO(Wrapper<ShengchandifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengchandifenleiView> selectListView(Wrapper<ShengchandifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengchandifenleiView selectView(Wrapper<ShengchandifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
