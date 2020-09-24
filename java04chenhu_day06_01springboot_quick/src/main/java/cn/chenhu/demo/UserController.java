package cn.chenhu.demo;

import cn.chenhu.domian.User;
import cn.chenhu.mapper.UserMapper;
import cn.chenhu.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.Map;

/**
 *
 */
@EnableSwagger2
@Api("用户信息")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("用户信息列表")
    @GetMapping("query")
    public List<User> queryUserList(){
        return userService.queryUserList();
    }

    /**
     * @PathVariable 配合 @RequestMapping使用可以获取到路径中的参数
     * http://localhost:8888/HelloWorld/blog/21  则 id=21
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Integer id){
        return userService.queryById(id);
    }

    @ApiOperation("用户注册")
    @PostMapping("/save")
    public String querysave(@RequestBody User user){
        System.out.println("接收的user： "+ user);
        userService.querysave(user);
        return "ok";
    }

    /**
     * 接收参数：@RequestBody 用Map接收参数，取数据，params.get
     * @param params
     * @return
     */
    @PostMapping("getUserByName")
    public List<User> getUserByName(@RequestBody Map params){
        String name = (String) params.get("name");
        System.out.println("name: "+name);
        List<User> users = userService.queryname(name);
        return users;
    }

    @PostMapping("getUserByName2")
    public List<User> getUserByName2(@RequestParam String name) {
        List<User> users = userService.queryname(name);
        return users;
    }

    @GetMapping("getUserTen")
    public List<User> getUserTen(){
        List<User> users = userService.getUserTen();
        return users;
    }

    @PostMapping("update")
    public String update(@RequestBody User user){
        System.out.println("接受的参数：" + user);
        userService.update(user);
        return "ok";
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public List<User> deleteById(@PathVariable("id") Integer id){
      return userService.deleteId(id);

    }


}
