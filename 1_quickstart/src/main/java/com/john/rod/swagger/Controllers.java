package com.john.rod.swagger;


import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class Controllers {

    @GetMapping("{userId}")
    public void findById(
            @ApiParam(value = "用戶I的",defaultValue = "101")
            @PathVariable Long userId){
    }

}
