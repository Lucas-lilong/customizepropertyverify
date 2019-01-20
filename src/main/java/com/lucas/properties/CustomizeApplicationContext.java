package com.lucas.properties;

import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;

public class CustomizeApplicationContext extends AnnotationConfigServletWebServerApplicationContext {
    @Override
    protected void initPropertySources() {
        super.initPropertySources();
        //把"MY_HOST"作为启动的时候必须验证的环境变量
        getEnvironment().setRequiredProperties("MYSQL_HOST");
    }
}
