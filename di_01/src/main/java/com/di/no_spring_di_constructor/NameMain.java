package com.di.no_spring_di_constructor;

import com.di.spring_di_xml_constructor.NameController;
import com.di.spring_di_xml_constructor.NameService;

public class NameMain {
    public static void main(String[] args) {
        // NameController에 전달할 NameService 클래스 객체 생성
        NameService nameService = new NameService();

        NameController controller = new NameController(nameService);
        controller.show("이몽룡");
    }
}
/*
NameMain 클래스에서 NameService 객체를 생성해서 NameController 클래스의 생성자의 인자로 전달(주입)하고
NameController 클래스의 생성자에서 매개변수로 받아서 NameService
*/