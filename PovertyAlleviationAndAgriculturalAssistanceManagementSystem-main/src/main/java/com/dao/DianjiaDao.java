package com.dao;

import com.entity.DianjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianjiaVO;
import com.entity.view.DianjiaView;


/**
 * 店家
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface DianjiaDao extends BaseMapper<DianjiaEntity> {
	
	List<DianjiaVO> selectListVO(@Param("ew") Wrapper<DianjiaEntity> wrapper);
	
	DianjiaVO selectVO(@Param("ew") Wrapper<DianjiaEntity> wrapper);
	
	List<DianjiaView> selectListView(@Param("ew") Wrapper<DianjiaEntity> wrapper);

	List<DianjiaView> selectListView(Pagination page,@Param("ew") Wrapper<DianjiaEntity> wrapper);
	
	DianjiaView selectView(@Param("ew") Wrapper<DianjiaEntity> wrapper);
	
}
