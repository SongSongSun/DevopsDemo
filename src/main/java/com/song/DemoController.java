package com.song;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Song
 * @Date 2022/12/30 22:58
 * @Version 1.0
 */
@RestController
@RequestMapping("hello")
public class DemoController {

    @GetMapping("world")
    public String helloWorld() {
        return "hello world! 恭喜部署成功";
    }
}
