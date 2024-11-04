package app.civil.civilapp.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import java.util.List;

@Configuration
@EnableScheduling
public class WebMvcConfig implements WebMvcConfigurer {
    //    클라이언트의 요청을 Json 형태의 요청 및 응답을 가능하게 함
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
    }
    // mdd 연동 Test
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:7050","http://localhost:3000")
                .allowedMethods("GET", "POST")
                .allowedHeaders("*");
    }
}