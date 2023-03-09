package com.entity.model;

import com.entity.AixinxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 爱心箱
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public class AixinxiangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 地区
	 */
	
	private String diqu;
		
	/**
	 * 店家名
	 */
	
	private String dianjiaming;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 贫困认证
	 */
	
	private String pinkunrenzheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 贫困介绍
	 */
	
	private String pinkunjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：地区
	 */
	 
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
				
	
	/**
	 * 设置：店家名
	 */
	 
	public void setDianjiaming(String dianjiaming) {
		this.dianjiaming = dianjiaming;
	}
	
	/**
	 * 获取：店家名
	 */
	public String getDianjiaming() {
		return dianjiaming;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：贫困认证
	 */
	 
	public void setPinkunrenzheng(String pinkunrenzheng) {
		this.pinkunrenzheng = pinkunrenzheng;
	}
	
	/**
	 * 获取：贫困认证
	 */
	public String getPinkunrenzheng() {
		return pinkunrenzheng;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：贫困介绍
	 */
	 
	public void setPinkunjieshao(String pinkunjieshao) {
		this.pinkunjieshao = pinkunjieshao;
	}
	
	/**
	 * 获取：贫困介绍
	 */
	public String getPinkunjieshao() {
		return pinkunjieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
