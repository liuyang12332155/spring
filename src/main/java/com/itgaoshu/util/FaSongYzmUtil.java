package com.itgaoshu.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 * @author 曹小花
 * @Title: FaSongYzmUtil
 * @Description: SpringCloudAlibaba课程
 * @date 2020/4/9 0009 15:13
 */
public class FaSongYzmUtil {
    public static boolean faSong(String phoneNumber,String yzm,int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fi8YvhNDJNcsN5rxuL8", "cJpzPI1CdlJ9E2X0d0tDfJMGtTYpQk");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
            //接收验证码的手机号
            request.putQueryParameter("PhoneNumbers", phoneNumber);
            //签名
            request.putQueryParameter("SignName", "碎嘴碎边");
            //发送验证码
            request.putQueryParameter("TemplateParam", "{\"code\":\""+yzm +"\"}");

            if(flag==1){//注册
                //登录或注册的模板编码
                request.putQueryParameter("TemplateCode", "SMS_187571031");
            }else{//登录
                request.putQueryParameter("TemplateCode", "SMS_187591075");
        }
        boolean flag1=false;
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            if(response.getData().contains("OK")){
                flag1=true;
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }

        return flag1;
    }
}
