package ua.laposhko.part1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class BeanProcessor implements BeanPostProcessor {


    private static final Logger LOGGER = LoggerFactory.getLogger(BeanProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        LOGGER.info("BeanProcessor:postProcessBeforeInitialization");
        LOGGER.info("o={}, s={}", o, s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        LOGGER.info("BeanProcessor:postProcessAfterInitialization");
        LOGGER.info("o={}, s={}", o, s);
        return o;
    }
}
