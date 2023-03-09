package com.dao;

import com.entity.AixinxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AixinxiangVO;
import com.entity.view.AixinxiangView;


/**
 * 爱心箱
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface AixinxiangDao extends BaseMapper<AixinxiangEntity> {
	
	List<AixinxiangVO> selectListVO(@Param("ew") Wrapper<AixinxiangEntity> wrapper);
	
	AixinxiangVO selectVO(@Param("ew") Wrapper<AixinxiangEntity> wrapper);
	
	List<AixinxiangView> selectListView(@Param("ew") Wrapper<AixinxiangEntity> wrapper);

	List<AixinxiangView> selectListView(Pagination page,@Param("ew") Wrapper<AixinxiangEntity> wrapper);
	
	AixinxiangView selectView(@Param("ew") Wrapper<AixinxiangEntity> wrapper);
	
}
