package cn.chenhu.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：读取yml文件的数据2
 */
@RestController
@ConfigurationProperties(prefix = "person")
public class ReadYmlController12 {

    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    private String addr;


    @RequestMapping("/getymldata2")
    public String getYmlData(){
        return "name is " + name+",addr is "+addr;
    }
}
