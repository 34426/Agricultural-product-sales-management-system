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


import com.dao.DiscussshangpinDao;
import com.entity.DiscussshangpinEntity;
import com.service.DiscussshangpinService;
import com.entity.vo.DiscussshangpinVO;
import com.entity.view.DiscussshangpinView;

@Service("discussshangpinService")
public class DiscussshangpinServiceImpl extends ServiceImpl<DiscussshangpinDao, DiscussshangpinEntity> implements DiscussshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshangpinEntity> page = this.selectPage(
                new Query<DiscussshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshangpinEntity> wrapper) {
		  Page<DiscussshangpinView> page =new Query<DiscussshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshangpinVO> selectListVO(Wrapper<DiscussshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshangpinVO selectVO(Wrapper<DiscussshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshangpinView> selectListView(Wrapper<DiscussshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshangpinView selectView(Wrapper<DiscussshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
