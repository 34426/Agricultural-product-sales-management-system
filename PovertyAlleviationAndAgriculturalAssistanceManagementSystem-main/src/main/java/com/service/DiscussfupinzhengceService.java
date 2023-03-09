package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfupinzhengceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfupinzhengceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfupinzhengceView;


/**
 * 扶贫政策评论表
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
public interface DiscussfupinzhengceService extends IService<DiscussfupinzhengceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfupinzhengceVO> selectListVO(Wrapper<DiscussfupinzhengceEntity> wrapper);
   	
   	DiscussfupinzhengceVO selectVO(@Param("ew") Wrapper<DiscussfupinzhengceEntity> wrapper);
   	
   	List<DiscussfupinzhengceView> selectListView(Wrapper<DiscussfupinzhengceEntity> wrapper);
   	
   	DiscussfupinzhengceView selectView(@Param("ew") Wrapper<DiscussfupinzhengceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfupinzhengceEntity> wrapper);
   	
}

