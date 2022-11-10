package com.example.nacosconfig3377.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope  //注解refreshScore实现配置自动更新，意思为如果想要使配置修改后不用重启项目即生效，可以使用该注解
public class DemoController {

    @Value("${config.info}")
    public String configInfo;

    @GetMapping(value = "/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
