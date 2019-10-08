package com.ant.web.config;

import com.ant.web.filter.ErrorInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lic
 * @data: 2019/9/30
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

//    @Autowired
//    private ErrorInterceptor errorInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(errorInterceptor);
//    }
//
//    	@Bean
//    public FilterRegistrationBean timeFilter() {
//
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//
//            ErrorInterceptor errorInterceptor = new ErrorInterceptor();
//        registrationBean.setFilter(errorInterceptor);
//
//        List<String> urls = new ArrayList<>();
//        urls.add("/*");
//        registrationBean.setUrlPatterns(urls);
//
//        return registrationBean;
//
//    }

}
