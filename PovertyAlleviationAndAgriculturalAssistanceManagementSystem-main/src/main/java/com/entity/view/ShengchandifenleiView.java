package com.entity.view;

import com.entity.ShengchandifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生产地分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@TableName("shengchandifenlei")
public class ShengchandifenleiView  extends ShengchandifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengchandifenleiView(){
	}
 
 	public ShengchandifenleiView(ShengchandifenleiEntity shengchandifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shengchandifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
