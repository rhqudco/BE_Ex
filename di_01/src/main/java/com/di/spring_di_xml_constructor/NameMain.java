package com.di.spring_di_xml_constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("WEB-INF/applicationContext.xml");
        NameController controller = context.getBean("nameController", NameController.class);
        controller.show("변학도");
        context.close();
    }
}