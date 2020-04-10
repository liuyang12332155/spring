package com.itgaoshu;

//import org.mybatis.spring.annotation.MapperScan;//不是这个包
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan; //如果使用通用Mapper接口,导的是这个包

@SpringBootApplication
@MapperScan("com.itgaoshu.mapper")//批量扫描Mapper接口,并创建Mapper接口的代理类对象
@EnableCaching  //开启缓存
public class GscmsBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GscmsBootApplication.class, args);
    }

}
