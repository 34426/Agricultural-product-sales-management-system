package com.entity.view;

import com.entity.DiscussshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:18
 */
@TableName("discussshangpin")
public class DiscussshangpinView  extends DiscussshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshangpinView(){
	}
 
 	public DiscussshangpinView(DiscussshangpinEntity discussshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
