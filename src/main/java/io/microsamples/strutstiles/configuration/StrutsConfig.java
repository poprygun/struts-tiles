package io.microsamples.strutstiles.configuration;


import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

@Configuration
public class StrutsConfig {
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new StrutsPrepareAndExecuteFilter());
        registration.addUrlPatterns("*.action");
        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        registration.setName("StrutsPrepareAndExecuteFilter");
        return registration;
    }
}
