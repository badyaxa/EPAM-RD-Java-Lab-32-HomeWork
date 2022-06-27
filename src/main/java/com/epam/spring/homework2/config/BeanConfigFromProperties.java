package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("application.properties")
@Import(BeansConfigManual.class)
public class BeanConfigFromProperties {

    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;

    @Value("${beanC.name}")
    private String nameC;
    @Value("${beanC.value}")
    private int valueC;

    @Value("${beanD.name}")
    private String nameD;
    @Value("${beanD.value}")
    private int valueD;

    @Bean(name = "beanB", initMethod = "customInitMethodBeanB", destroyMethod = "customDestroyMethodBeanB")
    @DependsOn("beanD")
    public BeanB getBeanB() {
        return new BeanB(name, value);
    }

    @Bean(name = "beanC", initMethod = "customInitMethodBeanC", destroyMethod = "customDestroyMethodBeanC")
    @DependsOn("beanB")
    public BeanC getBeanC() {
        return new BeanC(nameC, valueC);
    }

    @Bean(name = "beanD", initMethod = "customInitMethodBeanD", destroyMethod = "customDestroyMethodBeanD")
    public BeanD getBeanD() {
        return new BeanD(nameD, valueD);
    }
}
