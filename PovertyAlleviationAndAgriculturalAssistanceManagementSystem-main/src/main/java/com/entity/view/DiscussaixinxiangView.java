package com.entity.view;

import com.entity.DiscussaixinxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 爱心箱评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
@TableName("discussaixinxiang")
public class DiscussaixinxiangView  extends DiscussaixinxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussaixinxiangView(){
	}
 
 	public DiscussaixinxiangView(DiscussaixinxiangEntity discussaixinxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussaixinxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
