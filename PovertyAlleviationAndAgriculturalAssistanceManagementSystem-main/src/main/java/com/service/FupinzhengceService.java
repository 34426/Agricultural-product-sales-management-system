package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FupinzhengceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FupinzhengceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FupinzhengceView;


/**
 * 扶贫政策
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface FupinzhengceService extends IService<FupinzhengceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FupinzhengceVO> selectListVO(Wrapper<FupinzhengceEntity> wrapper);
   	
   	FupinzhengceVO selectVO(@Param("ew") Wrapper<FupinzhengceEntity> wrapper);
   	
   	List<FupinzhengceView> selectListView(Wrapper<FupinzhengceEntity> wrapper);
   	
   	FupinzhengceView selectView(@Param("ew") Wrapper<FupinzhengceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FupinzhengceEntity> wrapper);
   	
}

