package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PinkundianjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PinkundianjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PinkundianjiaxinxiView;


/**
 * 贫困店家信息
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface PinkundianjiaxinxiService extends IService<PinkundianjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PinkundianjiaxinxiVO> selectListVO(Wrapper<PinkundianjiaxinxiEntity> wrapper);
   	
   	PinkundianjiaxinxiVO selectVO(@Param("ew") Wrapper<PinkundianjiaxinxiEntity> wrapper);
   	
   	List<PinkundianjiaxinxiView> selectListView(Wrapper<PinkundianjiaxinxiEntity> wrapper);
   	
   	PinkundianjiaxinxiView selectView(@Param("ew") Wrapper<PinkundianjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PinkundianjiaxinxiEntity> wrapper);
   	
}

