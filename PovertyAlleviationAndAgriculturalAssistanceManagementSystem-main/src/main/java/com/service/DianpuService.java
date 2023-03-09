package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianpuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianpuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianpuView;


/**
 * 店铺
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface DianpuService extends IService<DianpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianpuVO> selectListVO(Wrapper<DianpuEntity> wrapper);
   	
   	DianpuVO selectVO(@Param("ew") Wrapper<DianpuEntity> wrapper);
   	
   	List<DianpuView> selectListView(Wrapper<DianpuEntity> wrapper);
   	
   	DianpuView selectView(@Param("ew") Wrapper<DianpuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianpuEntity> wrapper);
   	
}

