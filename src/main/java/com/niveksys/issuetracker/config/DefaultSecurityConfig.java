package com.niveksys.issuetracker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Profile("default")
public class DefaultSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/h2-console/**").permitAll() // allow h2 console access
                .antMatchers("/actuator/**").permitAll() // allow actuator access
                .anyRequest().authenticated() // allother urls can be access by any authrnticated role
                .and().formLogin() // enable form login instead of basic login
                .and().csrf().ignoringAntMatchers("/h2-console/**") // don't apply CSRF protection to /h2-console
                .and().headers().frameOptions().sameOrigin(); // allow use of frame to same origin urls
    }

}
