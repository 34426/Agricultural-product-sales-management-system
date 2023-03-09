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


import com.dao.DiscussaixinxiangDao;
import com.entity.DiscussaixinxiangEntity;
import com.service.DiscussaixinxiangService;
import com.entity.vo.DiscussaixinxiangVO;
import com.entity.view.DiscussaixinxiangView;

@Service("discussaixinxiangService")
public class DiscussaixinxiangServiceImpl extends ServiceImpl<DiscussaixinxiangDao, DiscussaixinxiangEntity> implements DiscussaixinxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussaixinxiangEntity> page = this.selectPage(
                new Query<DiscussaixinxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussaixinxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussaixinxiangEntity> wrapper) {
		  Page<DiscussaixinxiangView> page =new Query<DiscussaixinxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussaixinxiangVO> selectListVO(Wrapper<DiscussaixinxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussaixinxiangVO selectVO(Wrapper<DiscussaixinxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussaixinxiangView> selectListView(Wrapper<DiscussaixinxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussaixinxiangView selectView(Wrapper<DiscussaixinxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
