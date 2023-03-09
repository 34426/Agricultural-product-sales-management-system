package com.entity.view;

import com.entity.DianjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 店家
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@TableName("dianjia")
public class DianjiaView  extends DianjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianjiaView(){
	}
 
 	public DianjiaView(DianjiaEntity dianjiaEntity){
 	try {
			BeanUtils.copyProperties(this, dianjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
