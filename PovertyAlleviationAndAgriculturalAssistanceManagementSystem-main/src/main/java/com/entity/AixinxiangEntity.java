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
 * 爱心箱
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@TableName("aixinxiang")
public class AixinxiangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public AixinxiangEntity() {
		
	}
	
	public AixinxiangEntity(T t) {
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
