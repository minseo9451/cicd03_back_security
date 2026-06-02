package web.mvc.config;

import org.springframework.context.annotation.Configuration;
import
        org.springframework.web.servlet.config.annotation.CorsRegistry;
import
        org.springframework.web.servlet.config.annotation.EnableWebMvc;
import
        org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvcConfigurer 를 이용해서 @CrossOrigin 글로벌 설정
 *
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://3.36.74.121", "http://3.36.74.121/:80")
                .allowedOrigins("http://secretjuju.kro.kr", "https://secretjuju.kro.kr/")
                .allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE");
    }
}