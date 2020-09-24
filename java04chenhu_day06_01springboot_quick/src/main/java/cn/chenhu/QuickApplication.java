package cn.chenhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能：引导类
 */
@SpringBootApplication          //声明该类是springboot的引导类
public class QuickApplication {
    public static void main(String[] args) {
        //run方法，便是运行的springboot的引导类
        SpringApplication.run(QuickApplication.class,args);
        System.out.println("-----------------------------------------------");
        System.out.println("启动成功！！！");
    }
}
