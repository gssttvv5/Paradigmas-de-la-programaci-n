package com.hibernate.ferreteria.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.hibernate.ferreteria.Services.ServiceUsers;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final ServiceUsers userService;

    public SecurityConfig(ServiceUsers userService) {
        this.userService = userService;
    }

    @Bean
    public PasswordEncoder codificaPass() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, AuthenticationManager authManager) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**").permitAll()
                .requestMatchers("/api/articulos/**").hasAnyRole("ADMIN", "USER")
                .anyRequest().authenticated()
            )
            .authenticationManager(authManager)
            .userDetailsService(userService)
            .formLogin(form -> form.permitAll())
            .httpBasic(basic -> {});

        return http.build();
    }
}