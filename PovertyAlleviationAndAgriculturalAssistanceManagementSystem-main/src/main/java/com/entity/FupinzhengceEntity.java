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
 * 扶贫政策
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
@TableName("fupinzhengce")
public class FupinzhengceEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FupinzhengceEntity() {
		
	}
	
	public FupinzhengceEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 政策名称
	 */
					
	private String zhengcemingcheng;
	
	/**
	 * 发布单位
	 */
					
	private String fabudanwei;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 政策文件
	 */
					
	private String zhengcewenjian;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 政策介绍
	 */
					
	private String zhengcejieshao;
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：政策名称
	 */
	public void setZhengcemingcheng(String zhengcemingcheng) {
		this.zhengcemingcheng = zhengcemingcheng;
	}
	/**
	 * 获取：政策名称
	 */
	public String getZhengcemingcheng() {
		return zhengcemingcheng;
	}
	/**
	 * 设置：发布单位
	 */
	public void setFabudanwei(String fabudanwei) {
		this.fabudanwei = fabudanwei;
	}
	/**
	 * 获取：发布单位
	 */
	public String getFabudanwei() {
		return fabudanwei;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：政策文件
	 */
	public void setZhengcewenjian(String zhengcewenjian) {
		this.zhengcewenjian = zhengcewenjian;
	}
	/**
	 * 获取：政策文件
	 */
	public String getZhengcewenjian() {
		return zhengcewenjian;
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
	 * 设置：政策介绍
	 */
	public void setZhengcejieshao(String zhengcejieshao) {
		this.zhengcejieshao = zhengcejieshao;
	}
	/**
	 * 获取：政策介绍
	 */
	public String getZhengcejieshao() {
		return zhengcejieshao;
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
