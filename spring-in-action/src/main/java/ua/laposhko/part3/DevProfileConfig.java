package ua.laposhko.part3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ua.laposhko.common.SimpleBean;

@Configuration
@Profile("dev")
public class DevProfileConfig {

    @Bean
    public SimpleBean simpleBean() {
        SimpleBean simpleBean = new SimpleBean();
        simpleBean.setStringProperty("devProfile");
        return simpleBean;
    }

}
