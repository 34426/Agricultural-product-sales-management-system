package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinView;


/**
 * 商品
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface ShangpinService extends IService<ShangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinVO> selectListVO(Wrapper<ShangpinEntity> wrapper);
   	
   	ShangpinVO selectVO(@Param("ew") Wrapper<ShangpinEntity> wrapper);
   	
   	List<ShangpinView> selectListView(Wrapper<ShangpinEntity> wrapper);
   	
   	ShangpinView selectView(@Param("ew") Wrapper<ShangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinEntity> wrapper);
   	
}

