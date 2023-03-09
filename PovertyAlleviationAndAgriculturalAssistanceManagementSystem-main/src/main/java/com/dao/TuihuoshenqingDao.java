package com.dao;

import com.entity.TuihuoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuihuoshenqingVO;
import com.entity.view.TuihuoshenqingView;


/**
 * 退货申请
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface TuihuoshenqingDao extends BaseMapper<TuihuoshenqingEntity> {
	
	List<TuihuoshenqingVO> selectListVO(@Param("ew") Wrapper<TuihuoshenqingEntity> wrapper);
	
	TuihuoshenqingVO selectVO(@Param("ew") Wrapper<TuihuoshenqingEntity> wrapper);
	
	List<TuihuoshenqingView> selectListView(@Param("ew") Wrapper<TuihuoshenqingEntity> wrapper);

	List<TuihuoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<TuihuoshenqingEntity> wrapper);
	
	TuihuoshenqingView selectView(@Param("ew") Wrapper<TuihuoshenqingEntity> wrapper);
	
}
