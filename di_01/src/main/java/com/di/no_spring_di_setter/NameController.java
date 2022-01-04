package com.di.no_spring_di_setter;

public class NameController {
    NameService nameService;

    // 생성자 없고 Setter 메소드를 통해서 외부에서 주입 받음
    public void setNameService(NameService nameService) {
        this.nameService = nameService;
    }
    public void show(String name) {
        System.out.println("NameController : " + nameService.showName(name));
    }
}