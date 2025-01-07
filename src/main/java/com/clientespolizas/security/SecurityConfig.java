package com.clientespolizas.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {

    protected void configure(HttpSecurity http) throws Exception {
        http
                        .antMatchers("/api/clientes/**").hasRole("ADMIN")
                        .antMatchers("/api/polizas/**").hasAnyRole("ADMIN", "CLIENTE")
                        .anyRequest().authenticated()
                        .and()
                        .oauth2Login();
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser ("admin").password(passwordEncoder().encode("admin123")).roles("ADMIN")
            .and()
            .withUser ("cliente").password(passwordEncoder().encode("cliente123")).roles("CLIENTE");
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
