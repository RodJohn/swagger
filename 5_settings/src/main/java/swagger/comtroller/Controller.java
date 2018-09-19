package swagger.comtroller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import swagger.User;

@Api(tags="控制器显示名",description="控制器功能介绍")
@RestController
public class Controller {




    @ApiOperation(value="方法名", notes="方法功能介绍")
    @GetMapping("/user/get")
    public String handleMessage(){
        return "12321";
    }


    @ApiOperation(value="方法名", notes="方法功能介绍")
    @GetMapping("/user/{userid}")
    public void handleMessage2(
            @ApiParam(value="用户ID",required=true,defaultValue="1000")
            @PathVariable Long userid){
    }

    @ApiIgnore
    @GetMapping("/user/id")
    public void handleMessage4(
            @ApiParam(value="用户ID",required=true,defaultValue="1000")
            @PathVariable Long userid){
    }

    @GetMapping("/user/name")
    public void handleMessage3(
            @ApiParam(value="用户ID",required=true,defaultValue="1000")
            @PathVariable Long userid){
    }


    @ApiOperation(value="方法简介", notes="方法备注")
    @PostMapping("dog/4")
    User hello4(
            @ApiParam("用户实体")
            @RequestBody User user) {
        return user;
    }

    @ApiOperation(value="方法名", notes="方法功能介绍")
    @GetMapping("dog/param")
    public void handleMessage1(
            @ApiParam(value="参数解释",required=true,defaultValue="默认值")
            @RequestParam String name){
    }

}
