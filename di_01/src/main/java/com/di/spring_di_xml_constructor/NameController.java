package com.di.spring_di_xml_constructor;

public class NameController {
    // 멤버 변수 선언
    NameService nameService;
    // NameService 객체를 new 연산자를 통해 직접 만들지 않고 생성자를 통해 객체를 전달 받음.
    // 생성자를 통해 외부에서 주입
    // 의존성 주입
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }
    public void show(String name) {
        System.out.println("NameController : " + nameService.showName(name));
    }
}