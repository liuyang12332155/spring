package com.itgaoshu.mapper;

import com.itgaoshu.bean.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 曹小花
 * @Title: UserMapper2
 * @Description: SpringCloudAlibaba课程
 * @date 2020/4/8 0008 17:10
 *
 * 自定义Mapper接口继承自tk.mybatis.mapper.common.Mapper<T>,泛型为当前Mapper接口操作表对应的实体类
 */
public interface UserMapper2 extends Mapper<User> {


}
