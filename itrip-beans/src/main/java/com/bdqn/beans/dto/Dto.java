package com.bdqn.beans.dto;

import lombok.Data;
import lombok.ToString;

/**
 *@ClassName:Dto
 *@Description:TODO 数据传输对象
 *@Author:lzq
 *@Date: 2019/9/17 14:58
 **/
@Data
@ToString
public class Dto<T> {

    private String success;//true  false
    private String errorCode;//错误代码
    private String msg;//错误信息
    private T data;//传输的数据


}
