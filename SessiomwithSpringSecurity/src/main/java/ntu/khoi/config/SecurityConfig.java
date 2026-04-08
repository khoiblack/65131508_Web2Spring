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
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED) // Mặc định
                // .invalidSessionUrl("/invalid-session") // ĐÃ KHÓA: Tắt URL báo lỗi session
                .maximumSessions(1) // Chỉ cho phép 1 session
                .maxSessionsPreventsLogin(true) // Chặn người thứ 2 đăng nhập
                // .expiredUrl("/session-expired") // ĐÃ KHÓA: Tắt URL báo hết hạn
            );

        return http.build();
    }
}