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


import com.dao.DianjiaDao;
import com.entity.DianjiaEntity;
import com.service.DianjiaService;
import com.entity.vo.DianjiaVO;
import com.entity.view.DianjiaView;

@Service("dianjiaService")
public class DianjiaServiceImpl extends ServiceImpl<DianjiaDao, DianjiaEntity> implements DianjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianjiaEntity> page = this.selectPage(
                new Query<DianjiaEntity>(params).getPage(),
                new EntityWrapper<DianjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianjiaEntity> wrapper) {
		  Page<DianjiaView> page =new Query<DianjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianjiaVO> selectListVO(Wrapper<DianjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianjiaVO selectVO(Wrapper<DianjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianjiaView> selectListView(Wrapper<DianjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianjiaView selectView(Wrapper<DianjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
