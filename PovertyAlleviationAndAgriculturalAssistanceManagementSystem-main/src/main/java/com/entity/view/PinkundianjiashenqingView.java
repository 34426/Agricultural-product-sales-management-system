package com.entity.view;

import com.entity.PinkundianjiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 贫困店家申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@TableName("pinkundianjiashenqing")
public class PinkundianjiashenqingView  extends PinkundianjiashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PinkundianjiashenqingView(){
	}
 
 	public PinkundianjiashenqingView(PinkundianjiashenqingEntity pinkundianjiashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, pinkundianjiashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
