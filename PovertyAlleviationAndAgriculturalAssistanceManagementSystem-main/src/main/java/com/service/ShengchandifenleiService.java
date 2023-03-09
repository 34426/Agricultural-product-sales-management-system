package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengchandifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengchandifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengchandifenleiView;


/**
 * 生产地分类
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface ShengchandifenleiService extends IService<ShengchandifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengchandifenleiVO> selectListVO(Wrapper<ShengchandifenleiEntity> wrapper);
   	
   	ShengchandifenleiVO selectVO(@Param("ew") Wrapper<ShengchandifenleiEntity> wrapper);
   	
   	List<ShengchandifenleiView> selectListView(Wrapper<ShengchandifenleiEntity> wrapper);
   	
   	ShengchandifenleiView selectView(@Param("ew") Wrapper<ShengchandifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengchandifenleiEntity> wrapper);
   	
}

