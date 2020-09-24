package cn.chenhu.service.impl;

import cn.chenhu.domian.User;
import cn.chenhu.mapper.UserMapper;
import cn.chenhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 功能；业务层的实现类
 */
@Service
@Transactional //开启事务
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;  //运行期间动态创建mapper

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User queryById(Integer id) {
        return userMapper.queryById(id);
    }

    @Override
    public void querysave(User user) {
        userMapper.querysave(user);
    }

    @Override
    public List<User> queryname(String name) {
        return  userMapper.queryname("%"+name+"%");

    }

    @Override
    public List<User> getUserTen() {
        return userMapper.getUserTen();
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public List<User> deleteId(Integer id) {
        userMapper.deleteId(id);
        return userMapper.getUserTen();
    }


}
