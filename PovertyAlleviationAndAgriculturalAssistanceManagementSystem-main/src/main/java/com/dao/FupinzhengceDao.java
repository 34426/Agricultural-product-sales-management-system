package com.dao;

import com.entity.FupinzhengceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FupinzhengceVO;
import com.entity.view.FupinzhengceView;


/**
 * 扶贫政策
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface FupinzhengceDao extends BaseMapper<FupinzhengceEntity> {
	
	List<FupinzhengceVO> selectListVO(@Param("ew") Wrapper<FupinzhengceEntity> wrapper);
	
	FupinzhengceVO selectVO(@Param("ew") Wrapper<FupinzhengceEntity> wrapper);
	
	List<FupinzhengceView> selectListView(@Param("ew") Wrapper<FupinzhengceEntity> wrapper);

	List<FupinzhengceView> selectListView(Pagination page,@Param("ew") Wrapper<FupinzhengceEntity> wrapper);
	
	FupinzhengceView selectView(@Param("ew") Wrapper<FupinzhengceEntity> wrapper);
	
}
