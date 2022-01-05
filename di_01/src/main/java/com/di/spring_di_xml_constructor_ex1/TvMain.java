package com.di.spring_di_xml_constructor_ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("WEB-INF/applicationContext.xml");
        Tv tv = context.getBean("tv", Tv.class);
        tv.Up();
        tv.Down();
        context.close();
    }
}