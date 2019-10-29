package com.demo.controller;

import com.demo.service.AdminService;
import com.demo.service.impl.AdminServiceImpl;
import com.demo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Api(value = "Cat项目")
public class AdminController {

    @Autowired
    AdminService adminService;
    @PostMapping("/login")
    @ApiOperation(value = "输入用户名密码进行登录")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "用户名", name = "username", required = true, dataType = "String"),
            @ApiImplicitParam(value = "密码", name = "password", required = true, dataType = "String")
    })
    public R login(String username,String password) {
        return adminService.isLogin(username,password);
    }
}
