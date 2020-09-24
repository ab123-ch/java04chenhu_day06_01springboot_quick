package cn.chenhu.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：读取yml文件的数据
 */
@RestController
public class ReadYmlController1 {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/getymldata")
    public String getYmlData(){
        return "name is " + name + ",addr is "+addr;
    }
}
