package com.dao;

import com.entity.DiscussaixinxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussaixinxiangVO;
import com.entity.view.DiscussaixinxiangView;


/**
 * 爱心箱评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
public interface DiscussaixinxiangDao extends BaseMapper<DiscussaixinxiangEntity> {
	
	List<DiscussaixinxiangVO> selectListVO(@Param("ew") Wrapper<DiscussaixinxiangEntity> wrapper);
	
	DiscussaixinxiangVO selectVO(@Param("ew") Wrapper<DiscussaixinxiangEntity> wrapper);
	
	List<DiscussaixinxiangView> selectListView(@Param("ew") Wrapper<DiscussaixinxiangEntity> wrapper);

	List<DiscussaixinxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussaixinxiangEntity> wrapper);
	
	DiscussaixinxiangView selectView(@Param("ew") Wrapper<DiscussaixinxiangEntity> wrapper);
	
}
