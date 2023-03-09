package com.entity.view;

import com.entity.DiscussfupinzhengceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 扶贫政策评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
@TableName("discussfupinzhengce")
public class DiscussfupinzhengceView  extends DiscussfupinzhengceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfupinzhengceView(){
	}
 
 	public DiscussfupinzhengceView(DiscussfupinzhengceEntity discussfupinzhengceEntity){
 	try {
			BeanUtils.copyProperties(this, discussfupinzhengceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
