package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PinkundianjiashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PinkundianjiashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PinkundianjiashenqingView;


/**
 * 贫困店家申请
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface PinkundianjiashenqingService extends IService<PinkundianjiashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PinkundianjiashenqingVO> selectListVO(Wrapper<PinkundianjiashenqingEntity> wrapper);
   	
   	PinkundianjiashenqingVO selectVO(@Param("ew") Wrapper<PinkundianjiashenqingEntity> wrapper);
   	
   	List<PinkundianjiashenqingView> selectListView(Wrapper<PinkundianjiashenqingEntity> wrapper);
   	
   	PinkundianjiashenqingView selectView(@Param("ew") Wrapper<PinkundianjiashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PinkundianjiashenqingEntity> wrapper);
   	
}

