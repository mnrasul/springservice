package com.mnrasul.springservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageResource {

    @Value("${name}")
    private String name;

    @RequestMapping("/name")
    String getName() {
        return this.name;
    }
}
