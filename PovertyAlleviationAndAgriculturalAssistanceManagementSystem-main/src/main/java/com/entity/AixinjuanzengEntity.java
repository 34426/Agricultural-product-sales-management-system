package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 爱心捐赠
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@TableName("aixinjuanzeng")
public class AixinjuanzengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public AixinjuanzengEntity() {
		
	}
	
	public AixinjuanzengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 爱心编号
	 */
					
	private String aixinbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：爱心编号
	 */
	public void setAixinbianhao(String aixinbianhao) {
		this.aixinbianhao = aixinbianhao;
	}
	/**
	 * 获取：爱心编号
	 */
	public String getAixinbianhao() {
		return aixinbianhao;
	}
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
