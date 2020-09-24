package cn.chenhu.mapper;

import cn.chenhu.domian.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *功能；持久层的接口
 */
@Mapper
public interface UserMapper {

    List<User> queryUserList();

    /**
     * 功能：根据Id查询用户信息
     */
    User queryById(Integer id);

    void querysave(User user);

    List<User> queryname(String name);

    List<User> getUserTen();

    void update(User user);

    void deleteId(Integer id);
}
