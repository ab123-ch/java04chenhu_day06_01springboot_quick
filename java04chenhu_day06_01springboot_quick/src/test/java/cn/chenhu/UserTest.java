package cn.chenhu;


import cn.chenhu.domian.User;
import cn.chenhu.mapper.UserMapper;
import cn.chenhu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 功能：SpringBoot与Junit整合
 */
@SpringBootTest(classes = QuickApplication.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testQuery(){
        List<User> users = userService.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testqueryId(){
        User user = userService.queryById(28);
        System.out.println(user);
    }

    @Test
    public void testgetUserByName(){
        List<User> c = userService.queryname("c");
        for (User user : c) {
            System.out.println(user);
        }
    }

    @Test
    public void testgetupdate(){
        User user = new User();
        user.setId(42);
        user.setPassword("abc123.");
        userService.update(user);
    }

    @Test
    public void testdeleteId(){
        userService.deleteId(42);
    }
}
