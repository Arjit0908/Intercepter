package CentralAPIAudit.CentralAPIAudit.config;

import CentralAPIAudit.CentralAPIAudit.intercepter.Intercepter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//class to configuration of the intercepter that what controller should inplement the intercepter
@Configuration
public class StarConfig implements WebMvcConfigurer {


    @Bean
    public Intercepter intercepter() {
        return new Intercepter();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(intercepter());

    }
    //    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(Intercepter());
//    }

}

