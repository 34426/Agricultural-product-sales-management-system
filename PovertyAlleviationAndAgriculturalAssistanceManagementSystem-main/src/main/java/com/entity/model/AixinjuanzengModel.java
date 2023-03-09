package com.entity.model;

import com.entity.AixinjuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 爱心捐赠
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public class AixinjuanzengModel  implements Serializable {
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
	 * 捐赠金额
	 */
	
	private Integer juanzengjine;
		
	/**
	 * 捐赠说明
	 */
	
	private String juanzengshuoming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：捐赠金额
	 */
	 
	public void setJuanzengjine(Integer juanzengjine) {
		this.juanzengjine = juanzengjine;
	}
	
	/**
	 * 获取：捐赠金额
	 */
	public Integer getJuanzengjine() {
		return juanzengjine;
	}
				
	
	/**
	 * 设置：捐赠说明
	 */
	 
	public void setJuanzengshuoming(String juanzengshuoming) {
		this.juanzengshuoming = juanzengshuoming;
	}
	
	/**
	 * 获取：捐赠说明
	 */
	public String getJuanzengshuoming() {
		return juanzengshuoming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
