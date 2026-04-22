package ntu.khoi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // THÊM DÒNG NÀY VÀO ĐỂ ÉP SPRING BẬT CẤU HÌNH CỦA BẠN
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/api/**").permitAll() // Thả cửa trang chủ
                .requestMatchers("/admin/**").authenticated() // Khóa cửa trang admin
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .permitAll()
            );

        return http.build();
    }
}