package ua.laposhko.part1;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(LifeCycleBean.class);

    private InjectableBean injectableBean;

    public LifeCycleBean() {
        LOGGER.info("LifeCycleBean:constructor");

    }

    @Autowired
    public void setInjectableBean(InjectableBean injectableBean) {
        LOGGER.info("LifeCycleBean:setInjectableBean");
        this.injectableBean = injectableBean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOGGER.info("LifeCycleBean:setBeanFactory");
        LOGGER.info("beanFactory=" + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        LOGGER.info("LifeCycleBean:setBeanName");
        LOGGER.info("beanName=" + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.info("LifeCycleBean:setApplicationContext");
        LOGGER.info("applicationContext=" + applicationContext);
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        LOGGER.info("LifeCycleBean:postProcessBeforeInitialization");
        LOGGER.info("o=" + o + ", s=" + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        LOGGER.info("LifeCycleBean:setApplicationContext");
        LOGGER.info("o=" + o + ", s=" + s);
        return o;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("LifeCycleBean:afterPropertiesSet");
    }

    @PostConstruct
    public void init() {
        LOGGER.info("LifeCycleBean:init(@PostConstruct)");
    }

}
