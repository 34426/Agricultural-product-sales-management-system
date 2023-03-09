package com.dao;

import com.entity.PinkundianjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinkundianjiaxinxiVO;
import com.entity.view.PinkundianjiaxinxiView;


/**
 * 贫困店家信息
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface PinkundianjiaxinxiDao extends BaseMapper<PinkundianjiaxinxiEntity> {
	
	List<PinkundianjiaxinxiVO> selectListVO(@Param("ew") Wrapper<PinkundianjiaxinxiEntity> wrapper);
	
	PinkundianjiaxinxiVO selectVO(@Param("ew") Wrapper<PinkundianjiaxinxiEntity> wrapper);
	
	List<PinkundianjiaxinxiView> selectListView(@Param("ew") Wrapper<PinkundianjiaxinxiEntity> wrapper);

	List<PinkundianjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PinkundianjiaxinxiEntity> wrapper);
	
	PinkundianjiaxinxiView selectView(@Param("ew") Wrapper<PinkundianjiaxinxiEntity> wrapper);
	
}
