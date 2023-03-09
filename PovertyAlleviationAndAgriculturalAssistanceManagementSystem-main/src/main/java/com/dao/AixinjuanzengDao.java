package com.dao;

import com.entity.AixinjuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AixinjuanzengVO;
import com.entity.view.AixinjuanzengView;


/**
 * 爱心捐赠
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface AixinjuanzengDao extends BaseMapper<AixinjuanzengEntity> {
	
	List<AixinjuanzengVO> selectListVO(@Param("ew") Wrapper<AixinjuanzengEntity> wrapper);
	
	AixinjuanzengVO selectVO(@Param("ew") Wrapper<AixinjuanzengEntity> wrapper);
	
	List<AixinjuanzengView> selectListView(@Param("ew") Wrapper<AixinjuanzengEntity> wrapper);

	List<AixinjuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<AixinjuanzengEntity> wrapper);
	
	AixinjuanzengView selectView(@Param("ew") Wrapper<AixinjuanzengEntity> wrapper);
	
}
