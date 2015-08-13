package com.tun.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebMVCConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ ThymeleafConfig.class, WebAppConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{ "*.html" };
    }
}