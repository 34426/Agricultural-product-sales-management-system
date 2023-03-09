package com.dao;

import com.entity.PinkundianjiashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinkundianjiashenqingVO;
import com.entity.view.PinkundianjiashenqingView;


/**
 * 贫困店家申请
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface PinkundianjiashenqingDao extends BaseMapper<PinkundianjiashenqingEntity> {
	
	List<PinkundianjiashenqingVO> selectListVO(@Param("ew") Wrapper<PinkundianjiashenqingEntity> wrapper);
	
	PinkundianjiashenqingVO selectVO(@Param("ew") Wrapper<PinkundianjiashenqingEntity> wrapper);
	
	List<PinkundianjiashenqingView> selectListView(@Param("ew") Wrapper<PinkundianjiashenqingEntity> wrapper);

	List<PinkundianjiashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<PinkundianjiashenqingEntity> wrapper);
	
	PinkundianjiashenqingView selectView(@Param("ew") Wrapper<PinkundianjiashenqingEntity> wrapper);
	
}
