package com.john.rod.business.controller;


import com.john.rod.business.model.UserEditVo;
import com.john.rod.business.model.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("contact")
@Api("contact")
public class ContactController {


    @PostMapping
    @ApiOperation("add a new user")
    @ResponseBody
    public UserVo add(@Valid@RequestBody UserEditVo user) {
        return new UserVo();
    }


}
