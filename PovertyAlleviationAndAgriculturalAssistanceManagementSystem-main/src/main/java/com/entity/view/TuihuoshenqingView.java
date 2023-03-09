package com.entity.view;

import com.entity.TuihuoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退货申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@TableName("tuihuoshenqing")
public class TuihuoshenqingView  extends TuihuoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuihuoshenqingView(){
	}
 
 	public TuihuoshenqingView(TuihuoshenqingEntity tuihuoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, tuihuoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
