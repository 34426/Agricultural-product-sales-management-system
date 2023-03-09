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


import com.dao.AixinxiangDao;
import com.entity.AixinxiangEntity;
import com.service.AixinxiangService;
import com.entity.vo.AixinxiangVO;
import com.entity.view.AixinxiangView;

@Service("aixinxiangService")
public class AixinxiangServiceImpl extends ServiceImpl<AixinxiangDao, AixinxiangEntity> implements AixinxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AixinxiangEntity> page = this.selectPage(
                new Query<AixinxiangEntity>(params).getPage(),
                new EntityWrapper<AixinxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AixinxiangEntity> wrapper) {
		  Page<AixinxiangView> page =new Query<AixinxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AixinxiangVO> selectListVO(Wrapper<AixinxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AixinxiangVO selectVO(Wrapper<AixinxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AixinxiangView> selectListView(Wrapper<AixinxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AixinxiangView selectView(Wrapper<AixinxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
