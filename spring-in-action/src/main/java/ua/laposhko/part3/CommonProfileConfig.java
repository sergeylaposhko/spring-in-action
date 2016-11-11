package ua.laposhko.part3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ua.laposhko.common.SimpleBean;

@Configuration
public class CommonProfileConfig {

    @Bean
    @Profile("dev")
    public SimpleBean commonSimpleBeanDev() {
        SimpleBean simpleBean = new SimpleBean();
        simpleBean.setStringProperty("commonDevProfile");
        return simpleBean;
    }

    @Bean
    @Profile("prod")
    public SimpleBean commonSimpleBeanProd() {
        SimpleBean simpleBean = new SimpleBean();
        simpleBean.setStringProperty("commonProdProfile");
        return simpleBean;
    }


}
