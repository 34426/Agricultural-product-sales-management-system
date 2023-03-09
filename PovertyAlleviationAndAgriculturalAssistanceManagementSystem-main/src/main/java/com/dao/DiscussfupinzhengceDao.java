package com.dao;

import com.entity.DiscussfupinzhengceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfupinzhengceVO;
import com.entity.view.DiscussfupinzhengceView;


/**
 * 扶贫政策评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
public interface DiscussfupinzhengceDao extends BaseMapper<DiscussfupinzhengceEntity> {
	
	List<DiscussfupinzhengceVO> selectListVO(@Param("ew") Wrapper<DiscussfupinzhengceEntity> wrapper);
	
	DiscussfupinzhengceVO selectVO(@Param("ew") Wrapper<DiscussfupinzhengceEntity> wrapper);
	
	List<DiscussfupinzhengceView> selectListView(@Param("ew") Wrapper<DiscussfupinzhengceEntity> wrapper);

	List<DiscussfupinzhengceView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfupinzhengceEntity> wrapper);
	
	DiscussfupinzhengceView selectView(@Param("ew") Wrapper<DiscussfupinzhengceEntity> wrapper);
	
}
