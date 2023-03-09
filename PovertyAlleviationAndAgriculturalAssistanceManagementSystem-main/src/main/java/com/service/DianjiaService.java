package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianjiaView;


/**
 * 店家
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface DianjiaService extends IService<DianjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianjiaVO> selectListVO(Wrapper<DianjiaEntity> wrapper);
   	
   	DianjiaVO selectVO(@Param("ew") Wrapper<DianjiaEntity> wrapper);
   	
   	List<DianjiaView> selectListView(Wrapper<DianjiaEntity> wrapper);
   	
   	DianjiaView selectView(@Param("ew") Wrapper<DianjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianjiaEntity> wrapper);
   	
}

