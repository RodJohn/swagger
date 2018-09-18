package com.john.rod.swagger;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;


@Api(tags="控制器显示名",description="控制器功能介绍")
@RestController
public class Controllers {


    @ApiOperation(value="方法名", notes="方法功能介绍")
    @GetMapping("/get")
    public String handleMessage(){
        return "12321";
    }


    @ApiOperation(value="方法名", notes="方法功能介绍")
    @GetMapping("/param")
    public void handleMessage1(
            @ApiParam(value="参数解释",required=true,defaultValue="默认值")
            @RequestParam String name){
    }

    @ApiOperation(value="方法名", notes="方法功能介绍")
    @GetMapping("/user/{userid}")
    public void handleMessage2(
            @ApiParam(value="用户ID",required=true,defaultValue="1000")
            @PathVariable Long userid){
    }


    @ApiOperation(value="方法简介", notes="方法备注")
    @PostMapping("/4")
    User hello4(
            @ApiParam("用户实体")
            @RequestBody User user) {
        return user;
    }
}
