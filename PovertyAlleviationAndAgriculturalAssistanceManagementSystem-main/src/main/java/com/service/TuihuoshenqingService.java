package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuihuoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuihuoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuihuoshenqingView;


/**
 * 退货申请
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public interface TuihuoshenqingService extends IService<TuihuoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuihuoshenqingVO> selectListVO(Wrapper<TuihuoshenqingEntity> wrapper);
   	
   	TuihuoshenqingVO selectVO(@Param("ew") Wrapper<TuihuoshenqingEntity> wrapper);
   	
   	List<TuihuoshenqingView> selectListView(Wrapper<TuihuoshenqingEntity> wrapper);
   	
   	TuihuoshenqingView selectView(@Param("ew") Wrapper<TuihuoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuihuoshenqingEntity> wrapper);
   	
}

