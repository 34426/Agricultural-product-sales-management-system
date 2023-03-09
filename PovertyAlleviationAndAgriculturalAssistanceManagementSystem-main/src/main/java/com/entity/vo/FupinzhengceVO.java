package com.entity.vo;

import com.entity.FupinzhengceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 扶贫政策
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-18 15:18:17
 */
public class FupinzhengceVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
