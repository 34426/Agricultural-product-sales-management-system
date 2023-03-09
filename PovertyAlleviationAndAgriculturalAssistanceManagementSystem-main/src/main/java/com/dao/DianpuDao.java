package com.dao;

import com.entity.DianpuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianpuVO;
import com.entity.view.DianpuView;


/**
 * 店铺
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface DianpuDao extends BaseMapper<DianpuEntity> {
	
	List<DianpuVO> selectListVO(@Param("ew") Wrapper<DianpuEntity> wrapper);
	
	DianpuVO selectVO(@Param("ew") Wrapper<DianpuEntity> wrapper);
	
	List<DianpuView> selectListView(@Param("ew") Wrapper<DianpuEntity> wrapper);

	List<DianpuView> selectListView(Pagination page,@Param("ew") Wrapper<DianpuEntity> wrapper);
	
	DianpuView selectView(@Param("ew") Wrapper<DianpuEntity> wrapper);
	
}
