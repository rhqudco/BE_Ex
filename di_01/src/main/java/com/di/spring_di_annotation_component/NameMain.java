package com.di.spring_di_annotation_component;

import com.di.spring_di_annotation.NameController;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("application_Context4.xml");
        // 컨테이너에서 컴포넌트(빈) 가져옴
        NameController controller = context.getBean("nameController", NameController.class);
        controller.show("컴포넌트");
        context.close();
    }
}