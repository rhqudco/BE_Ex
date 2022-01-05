package com.di.spring_di_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("WEB-INF/applicationContext3.xml");
        // 컨테이너에서 컴포넌트(빈) 가져옴
        NameController controller = context.getBean("nameController", NameController.class);
        controller.show("박길동");
        context.close();
    }
}