package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AixinxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AixinxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AixinxiangView;


/**
 * 爱心箱
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface AixinxiangService extends IService<AixinxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AixinxiangVO> selectListVO(Wrapper<AixinxiangEntity> wrapper);
   	
   	AixinxiangVO selectVO(@Param("ew") Wrapper<AixinxiangEntity> wrapper);
   	
   	List<AixinxiangView> selectListView(Wrapper<AixinxiangEntity> wrapper);
   	
   	AixinxiangView selectView(@Param("ew") Wrapper<AixinxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AixinxiangEntity> wrapper);
   	
}

