package com.john.rod.business.controller;


import com.john.rod.business.model.UserEditVo;
import com.john.rod.business.model.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
@Api(tags = "用户接口" ,description = "用户的增删改查")
public class UserController {

    @PostMapping
    @ApiOperation("add a new user")
    public UserVo add( @RequestBody UserEditVo user) {
        UserVo userVo = new UserVo();
        userVo.setId(90L);
        return userVo;
    }

    @DeleteMapping("{id}")
    @ApiOperation("delete the user by id")
    public void deleteById(@PathVariable Long id) {
    }

    @PutMapping("{id}")
    @ApiOperation("update the user by id ")
    public void update(@PathVariable Long id, @RequestBody UserEditVo user) {
    }

    @GetMapping("{id}")
    @ApiOperation("find user by id")
    public UserVo findById(@PathVariable Long id) {
        return new UserVo();
    }

}
