package by.berdmival.derevenskoe.configuration;

import by.berdmival.derevenskoe.utils.FileManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
//@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {
    @Value("${upload.path}")
    private String uploadPath;

    @Bean
    public FileManager fileManager() {
        return new FileManager(uploadPath);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**")
                .addResourceLocations(new File(uploadPath).getAbsolutePath() + File.separator);
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/static/");
    }
}

