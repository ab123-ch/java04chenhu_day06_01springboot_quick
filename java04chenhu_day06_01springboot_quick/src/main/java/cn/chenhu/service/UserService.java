package cn.chenhu.service;

import cn.chenhu.domian.User;

import java.util.List;

public interface UserService {
    /**
     * 功能：查询所有用户
     * @return
     */
    List<User> queryUserList();

    /**
     * 功能：根据Id查询用户信息
     */
    User queryById(Integer id);

    /**
     * 注册用户
     */
    void querysave(User user);

    List<User> queryname(String name);

    List<User> getUserTen();

    void update(User user);

    List<User> deleteId(Integer id);
}
