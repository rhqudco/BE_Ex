package com.di.no_spring_no_di;

public class NameController {
    // 원하는 곳에서 new 연산자를 사용해서 객체 직접 생성
    // 의존성은 존재하나 DI는 아님
    NameService nameService = new NameService();

    // 이름을 전달 받아서 NameService 클래스의 showName() 메소드에게 전달하고
    // "내 이름은 ~ 입니다" 전달 받아서 출력하는 메소드.
    public void show(String name) {
        System.out.println("NameController : " + nameService.showName(name));
    }
}