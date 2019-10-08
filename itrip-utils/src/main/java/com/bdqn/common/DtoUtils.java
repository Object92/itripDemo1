package com.bdqn.common;


import com.bdqn.beans.dto.Dto;
import com.bdqn.beans.pojo.ItripUser;


/**
 *@ClassName:
 *@Description: TODO 数据传输的工具类
 *@Author:lzq
 *@Date: 2019/9/17 16:19
 **/
public class DtoUtils {

    public final static String SUCCESS = "true";
    public final static String FAIL = "fail";
    public final static String ERRORCODE = "0";


    //同意返回的DTO 带数据
    public static Dto returnSuccess(String message,Object data){
        Dto dto=new Dto();
        dto.setSuccess(SUCCESS);
        dto.setData(data);
        dto.setMsg(message);
        dto.setErrorCode(ERRORCODE);
        return dto;
    }

    //同意返回成功的DTO 不带数据
    public static Dto returnSuccess(String message){
        Dto dto=new Dto();
        dto.setSuccess(SUCCESS);
        dto.setMsg(message);
        dto.setErrorCode(ERRORCODE);
        return dto;
    }

    //同意返回成功的DTO 带数据 没有消息
    public static Dto returnSuccess(ItripUser data){
        Dto dto=new Dto();
        dto.setSuccess(SUCCESS);
        dto.setData(data);
        dto.setErrorCode(ERRORCODE);
        return dto;
    }

    //同意返回失败的DTO 不带数据 带消息消息 带错误代码
    public static Dto returnFail(String message,String errorCode){
        Dto dto=new Dto();
        dto.setSuccess(FAIL);
        dto.setMsg(message);
        dto.setErrorCode(errorCode);
        return dto;
    }

    //同意返回失败的DTO 带错误数据 带错误代码
    public static Dto returnFail(Object data,String msg){
        Dto dto=new Dto();
        dto.setSuccess(FAIL);
        dto.setMsg(msg);
        dto.setData(data);
        return dto;
    }

}
