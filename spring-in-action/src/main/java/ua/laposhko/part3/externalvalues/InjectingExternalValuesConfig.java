package ua.laposhko.part3.externalvalues;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import ua.laposhko.common.SimpleBean;

@Configuration
@ComponentScan
@PropertySource("external-values.properties")
public class InjectingExternalValuesConfig {

    @Autowired
    private Environment env;

    @Bean
    public SimpleBean simpleBean() {
        SimpleBean simpleBean = new SimpleBean();
        simpleBean.setStringProperty(env.getProperty("simpleBean.string"));
        simpleBean.setIntProperty(env.getProperty("simpleBean.int", Integer.class));
        return simpleBean;
    }

}
