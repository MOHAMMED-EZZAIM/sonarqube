package org.sid.safarent.security.util.cloudinaryConfig;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {
    @Value("${API-environment-variable}")
    private String uploadDir;
    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(uploadDir);
    }
}


