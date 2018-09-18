package com.john.rod.swagger;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class User {

    @ApiModelProperty(value = "用户ID",required = true,example = "100",position = 1)
    private Long id;
    @ApiModelProperty(value = "用户名",required = true,example = "John",position = 2)
    private String name;
    @ApiModelProperty(value = "客户端时间",required = true,example = "2018-08-08",position = 3)
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
