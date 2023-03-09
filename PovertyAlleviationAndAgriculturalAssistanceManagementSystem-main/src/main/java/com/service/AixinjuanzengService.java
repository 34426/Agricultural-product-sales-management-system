package com.service;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AixinjuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AixinjuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AixinjuanzengView;



/**
 * 爱心捐赠
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface AixinjuanzengService extends IService<AixinjuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AixinjuanzengVO> selectListVO(Wrapper<AixinjuanzengEntity> wrapper);
   	
   	AixinjuanzengVO selectVO(@Param("ew") Wrapper<AixinjuanzengEntity> wrapper);
   	
   	List<AixinjuanzengView> selectListView(Wrapper<AixinjuanzengEntity> wrapper);
   	
   	AixinjuanzengView selectView(@Param("ew") Wrapper<AixinjuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AixinjuanzengEntity> wrapper);
   	
}

