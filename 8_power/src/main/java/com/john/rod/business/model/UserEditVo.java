package com.john.rod.business.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@ApiModel
public class UserEditVo {


    @ApiModelProperty(notes = "id",required = true,example="10012323333")
    private Long id;


    @ApiModelProperty(notes = "用戶名",required = true,example="john")
    private String name ;

    @ApiModelProperty(notes = "年龄",required = true,example="30")
    private Integer age;

}
