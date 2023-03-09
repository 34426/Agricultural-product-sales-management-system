package com.dao;

import com.entity.DiscussshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshangpinVO;
import com.entity.view.DiscussshangpinView;


/**
 * 商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
public interface DiscussshangpinDao extends BaseMapper<DiscussshangpinEntity> {
	
	List<DiscussshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussshangpinEntity> wrapper);
	
	DiscussshangpinVO selectVO(@Param("ew") Wrapper<DiscussshangpinEntity> wrapper);
	
	List<DiscussshangpinView> selectListView(@Param("ew") Wrapper<DiscussshangpinEntity> wrapper);

	List<DiscussshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangpinEntity> wrapper);
	
	DiscussshangpinView selectView(@Param("ew") Wrapper<DiscussshangpinEntity> wrapper);
	
}
