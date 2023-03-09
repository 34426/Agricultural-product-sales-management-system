package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianpuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianpuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianpuView;


/**
 * 店铺评论表
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
public interface DiscussdianpuService extends IService<DiscussdianpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianpuVO> selectListVO(Wrapper<DiscussdianpuEntity> wrapper);
   	
   	DiscussdianpuVO selectVO(@Param("ew") Wrapper<DiscussdianpuEntity> wrapper);
   	
   	List<DiscussdianpuView> selectListView(Wrapper<DiscussdianpuEntity> wrapper);
   	
   	DiscussdianpuView selectView(@Param("ew") Wrapper<DiscussdianpuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianpuEntity> wrapper);
   	
}

