package com.stormpath.test;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessagesConfig {

    //@Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource src = new ResourceBundleMessageSource();
        src.setBasename("com.stormpath.sdk.servlet.i18n");
        src.setDefaultEncoding("UTF-8");
        return src;
    }
}
