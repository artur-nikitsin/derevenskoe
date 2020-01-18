package by.berdmival.derevenskoe.configuration;

import by.berdmival.derevenskoe.interceptor.RootPathInterceptor;
import by.berdmival.derevenskoe.util.FileManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {
    @Value("${upload.path}")
    private String uploadPath;

    @Bean
    public FileManager fileManager() {
        return new FileManager(uploadPath);
    }

    @Bean
    public RootPathInterceptor rootPathInterceptor() {
        return new RootPathInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(rootPathInterceptor())
                .addPathPatterns("/");
    }
}

