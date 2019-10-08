package com.bdqn.biz.controller;

import com.bdqn.beans.pojo.ItripUser;
import com.bdqn.common.DtoUtils;
import com.bdqn.beans.dto.Dto;
import com.bdqn.biz.service.IItripUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *@ClassName:
 *@Description: TODO 爱旅行用户控制器
 *@Author:lzq
 *@Date: 2019/9/17 16:04
 **/
@Controller
@RequestMapping("/itripUser")
public class ItripUserController {

    @Autowired
    private IItripUserService iItripUserService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }


    /**
     * Description: TODO 获取某个用户的信息
     * param:
     * return:
     * Date:
     */
    @ApiOperation(value = "获取用户的信息",httpMethod = "GET",
            protocols = "HTTP", produces = "application/json",
            response = Dto.class,notes="获取某个用户的信息")
    @ApiParam(required=true,name="id",value="用户的ID",defaultValue = "12")
    @GetMapping("/getItripUserById/{id}")
    public @ResponseBody Dto<ItripUser> getItripUserById(@PathVariable("id") Long id){
        ItripUser itripUser=iItripUserService.findItripUserById(id);
        if(itripUser==null){
            return DtoUtils.returnFail("用户不存在","10001");
        }
        return DtoUtils.returnSuccess(itripUser);
    }
}
