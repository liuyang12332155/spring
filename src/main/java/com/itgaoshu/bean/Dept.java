package com.itgaoshu.bean;

/**
 * @author 曹小花
 * @Title: Dept
 * @Description: SpringCloudAlibaba课程
 * @date 2020/4/10 0010 11:15
 */
public class Dept {
    private int deptno=11;
    private String dname;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
