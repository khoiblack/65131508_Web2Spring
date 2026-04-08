package ntu.khoi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                
                .requestMatchers("/invalid-session", "/session-expired").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
               
                .defaultSuccessUrl("/home", true)
                .permitAll()
            )
            .logout(logout -> logout
                .permitAll()
               
            )
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED) 
                .invalidSessionUrl("/invalid-session") 
                .maximumSessions(1) 
                .maxSessionsPreventsLogin(true) 
                .expiredUrl("/session-expired") 
            );

        return http.build();
    }
    
    
}