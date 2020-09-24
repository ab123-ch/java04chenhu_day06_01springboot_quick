package cn.chenhu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 */
@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String quick(){
        return "hello word噢噢噢噢";
    }
}
