package com.di.spring_di_xml_constructor_value;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("WEB-INF/applicationContext2.xml");
        Member member = context.getBean("member", Member.class);
        System.out.println(member); // toString 자동 호출
        member.showBMI();
        context.close();
    }
}