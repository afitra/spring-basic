package com.example.demo_satu.processor;

import com.example.demo_satu.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix ID generator processos for bean {}  ", beanName);
        if (bean instanceof IdAware) {
            log.info("Prefix set id genrator for bean {} ", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PRE-" + idAware.getId());
        }

        return bean;
    }


}
