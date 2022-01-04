package com.di.no_spring_di_setter;

public class NameService {
    // 이름 전달 받아서  "내 이름은 ~ 입니다" 반환하는 메소드
    public String showName(String name) {
        System.out.println("NameService showName() 메소드");
        String myName = "내 이름은 " + name + " 입니다.";
        return myName;
    }
}