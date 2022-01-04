package com.di.spring_di_xml_setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext2.xml");
        NameController controller = context.getBean("nameController", NameController.class);
        controller.show("강길동");
        context.close();
    }
}