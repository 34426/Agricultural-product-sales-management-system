package com.dao;

import com.entity.ShengchandifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengchandifenleiVO;
import com.entity.view.ShengchandifenleiView;


/**
 * 生产地分类
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface ShengchandifenleiDao extends BaseMapper<ShengchandifenleiEntity> {
	
	List<ShengchandifenleiVO> selectListVO(@Param("ew") Wrapper<ShengchandifenleiEntity> wrapper);
	
	ShengchandifenleiVO selectVO(@Param("ew") Wrapper<ShengchandifenleiEntity> wrapper);
	
	List<ShengchandifenleiView> selectListView(@Param("ew") Wrapper<ShengchandifenleiEntity> wrapper);

	List<ShengchandifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengchandifenleiEntity> wrapper);
	
	ShengchandifenleiView selectView(@Param("ew") Wrapper<ShengchandifenleiEntity> wrapper);
	
}
