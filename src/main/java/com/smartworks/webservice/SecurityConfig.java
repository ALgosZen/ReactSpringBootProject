package com.smartworks.webservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    //we have stopped the csrf to make post method work . without this post will give 403 forbidden
    protected void configure(HttpSecurity http) throws Exception{
        http.cors().and().csrf().disable();
    }
}
