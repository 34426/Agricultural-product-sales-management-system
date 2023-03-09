package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussaixinxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussaixinxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussaixinxiangView;


/**
 * 爱心箱评论表
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
public interface DiscussaixinxiangService extends IService<DiscussaixinxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussaixinxiangVO> selectListVO(Wrapper<DiscussaixinxiangEntity> wrapper);
   	
   	DiscussaixinxiangVO selectVO(@Param("ew") Wrapper<DiscussaixinxiangEntity> wrapper);
   	
   	List<DiscussaixinxiangView> selectListView(Wrapper<DiscussaixinxiangEntity> wrapper);
   	
   	DiscussaixinxiangView selectView(@Param("ew") Wrapper<DiscussaixinxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussaixinxiangEntity> wrapper);
   	
}

