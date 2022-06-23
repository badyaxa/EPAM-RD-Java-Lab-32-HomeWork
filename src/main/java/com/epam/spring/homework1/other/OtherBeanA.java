package com.epam.spring.homework1.other;

import com.epam.spring.homework1.beans.BeanA;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {
    private BeanA beanA;

    //    @Autowired (it is not necessary to put this annotation over the constructor)
    public OtherBeanA(BeanA beanA) {
        this.beanA = beanA;
        System.out.println(this.getClass().getSimpleName() + ". " + beanA.getClass().getSimpleName() + " was injected through the constructor");
    }
}