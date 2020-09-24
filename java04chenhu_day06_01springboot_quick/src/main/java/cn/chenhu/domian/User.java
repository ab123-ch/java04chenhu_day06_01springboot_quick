package cn.chenhu.domian;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 作用:
 */
@Data                   //注在类上，提供类的get,set,equals,hashcode,canEqual,toString等方法
@NoArgsConstructor      //注在类上，提供类的全参构造
@AllArgsConstructor     //注在类上，提供类的无参构造
public class User {
    private Integer id;
    private String username;
//    @JsonIgnore
    private String password;
    private String name;
    private String birthday;
    private String sex;
    private String telephone;
    private String email;


}
