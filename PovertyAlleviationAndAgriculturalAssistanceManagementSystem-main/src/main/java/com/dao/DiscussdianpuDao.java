package com.dao;

import com.entity.DiscussdianpuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianpuVO;
import com.entity.view.DiscussdianpuView;


/**
 * 店铺评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
public interface DiscussdianpuDao extends BaseMapper<DiscussdianpuEntity> {
	
	List<DiscussdianpuVO> selectListVO(@Param("ew") Wrapper<DiscussdianpuEntity> wrapper);
	
	DiscussdianpuVO selectVO(@Param("ew") Wrapper<DiscussdianpuEntity> wrapper);
	
	List<DiscussdianpuView> selectListView(@Param("ew") Wrapper<DiscussdianpuEntity> wrapper);

	List<DiscussdianpuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianpuEntity> wrapper);
	
	DiscussdianpuView selectView(@Param("ew") Wrapper<DiscussdianpuEntity> wrapper);
	
}
