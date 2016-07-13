package com.stormpath.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Value("${stormpath.web.handlerMapping.order}")
    private int stormpathHandlerMappingOrder = -300;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.setOrder(stormpathHandlerMappingOrder);
        registry.addResourceHandler("/assets/js/stormpath.js").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/assets/css/stormpath.css").addResourceLocations("classpath:/META-INF/resources/");
    }
}
