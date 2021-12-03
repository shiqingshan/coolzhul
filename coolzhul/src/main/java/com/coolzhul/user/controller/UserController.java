package com.coolzhul.user.controller;

import com.coolzhul.common.base.BusinessResponse;
import com.coolzhul.common.util.BusinessResponseUtil;
import com.coolzhul.user.model.User;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
@Api("coolzhul 用户相关的api")
public class UserController {
    @RequestMapping(value = "/getUser",method = {RequestMethod.GET,RequestMethod.POST})
    public BusinessResponse<User> getUser(){
        User user = new User();
        user.setUserId("321");
        return BusinessResponseUtil.success("成功",user);
    }
}
