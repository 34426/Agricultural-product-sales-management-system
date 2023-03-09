package com.entity.view;

import com.entity.DiscussdianpuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 店铺评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
@TableName("discussdianpu")
public class DiscussdianpuView  extends DiscussdianpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdianpuView(){
	}
 
 	public DiscussdianpuView(DiscussdianpuEntity discussdianpuEntity){
 	try {
			BeanUtils.copyProperties(this, discussdianpuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
