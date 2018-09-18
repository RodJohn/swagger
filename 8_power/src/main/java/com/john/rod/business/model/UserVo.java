package com.john.rod.business.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
public class UserVo  {

    @ApiModelProperty(notes = "id")
    private Long id;

    @ApiModelProperty(notes = "用戶名")
    private String name ;

    @ApiModelProperty(notes = "年龄")
    private Integer age;


}
