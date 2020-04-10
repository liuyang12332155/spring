package com.itgaoshu.util;

/**
 * @author 曹小花
 * @Title: ShengChengYzmUtil
 * @Description: SpringCloudAlibaba课程
 * @date 2020/4/9 0009 17:00
 */
public class ShengChengYzmUtil {
    /**
     * 随机生成六位验证码
     * @return
     */
    public static String getYzm(){
        String yzm="";
        for(int i=1;i<=6;i++){
            yzm+=(int)Math.floor(Math.random()*10);
        }

        return yzm;
    }
}
