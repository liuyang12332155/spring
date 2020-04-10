package com.itgaoshu.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 二级缓存中操作的实体类需要被序列化:实现Serializable接口
 * @author Administrator
 *	1.实现序列化接口
 * 	2.实体类中的属性类型需要为包装类类型
 * 	3.在实体类上添加@Table注解,然后使用name属性指定该实体类映射的表名
 * 	4.在唯一属性上添加@Id的注解关联表中的主键
 * 	5.如果属性名和字段名不一致,需要在每个属性上添加@Column注解,name属性指定字段名
 */
@Table(name = "tuser")
public class User implements Serializable{
	@Id
	@GeneratedValue(generator = "JDBC")
	private Integer id;//用户编号
	
	private String loginname;//用户名
	
	private String password;//密码
	
	private String realname;//真实姓名
	
	private String sex;//性别
	
	private String birthday;//出生年月
	
	private Integer deptno;//部门编号
	
	private String email;//邮箱

	private Integer enabled;//是否可用
	
	private Integer createman;//创建人

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getCreateman() {
		return createman;
	}

	public void setCreateman(Integer createman) {
		this.createman = createman;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password=" + password + ", realname=" + realname
				+ ", sex=" + sex + ", birthday=" + birthday + ", deptno=" + deptno + ", email=" + email + ", enabled="
				+ enabled + ", createman=" + createman + "]";
	}
	
	
}
